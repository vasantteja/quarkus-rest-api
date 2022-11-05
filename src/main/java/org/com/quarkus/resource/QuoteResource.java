package org.com.quarkus.resource;

import io.smallrye.common.annotation.Blocking;
import org.com.quarkus.dto.QuoteDTO;
import org.com.quarkus.model.Quote;
import org.com.quarkus.service.QuoteFetcherService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.Set;

@Path("/stock")
public class QuoteResource {

    @RestClient
    QuoteFetcherService service;

    @GET
    @Blocking
    public QuoteDTO id(@QueryParam("symbol") String symbol) {
        Quote quote = service.getBySymbol(symbol);
        QuoteDTO quoteDTO = new QuoteDTO();
        quoteDTO.setCurrentPrice(quote.getC());
        quoteDTO.setChange(quote.getD());
        quoteDTO.setPercentChange(quote.getDp());
        quoteDTO.setHighPrice(quote.getH());
        quoteDTO.setLowPrice(quote.getL());
        quoteDTO.setOpenPrice(quote.getO());
        quoteDTO.setPreviousClose(quote.getPc());
        return quoteDTO;

    }
}
