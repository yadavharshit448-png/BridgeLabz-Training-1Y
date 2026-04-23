package com.gla.stream_api;

import java.util.List;
import java.time.LocalDateTime;

public class LoggingTransactions {
    public static void main(String[] args) {
        List<String> transactionIds = List.of("TXN-901", "TXN-902", "TXN-903");

        System.out.println("Transaction Logs:");
        transactionIds.forEach(id -> 
            System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}
