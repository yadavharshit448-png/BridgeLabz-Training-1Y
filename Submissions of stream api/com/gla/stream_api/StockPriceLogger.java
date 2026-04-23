package com.gla.stream_api;

import java.util.List;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = List.of(150.5, 152.0, 149.5, 155.2);

        System.out.println("Live Stock Updates:");
        stockPrices.stream().forEach(price -> System.out.println("Price update: $" + price));
    }
}
