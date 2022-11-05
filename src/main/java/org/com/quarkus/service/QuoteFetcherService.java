package org.com.quarkus.service;

import org.com.quarkus.model.Quote;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/quote")
@RegisterRestClient(configKey = "quote-api")
@ClientHeaderParam(name = "X-Finnhub-Token", value = "cdhekhaad3i07d1j76s0cdhekhaad3i07d1j76sg")
public interface QuoteFetcherService {

    @GET
    Quote getBySymbol(@QueryParam("symbol") String stockName);
}
