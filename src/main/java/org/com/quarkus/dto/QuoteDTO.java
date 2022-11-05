package org.com.quarkus.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class QuoteDTO {

    public float currentPrice;
    public float change;
    public float percentChange;
    public float highPrice;
    public float lowPrice;
    public float openPrice;
    public float previousClose;
}
