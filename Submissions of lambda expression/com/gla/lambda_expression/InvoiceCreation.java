package com.gla.lambda_expression;

import java.util.List;
import java.util.stream.Collectors;

public class InvoiceCreation {
    static class Invoice {
        String transactionId;
        public Invoice(String tid) {
            this.transactionId = tid;
        }
        public String toString() { return "Invoice[TXN: " + transactionId + "]"; }
    }

    public static void main(String[] args) {
        List<String> txnIds = List.of("TXN991", "TXN992", "TXN993");

        // Constructor reference
        List<Invoice> invoices = txnIds.stream()
                                       .map(Invoice::new)
                                       .collect(Collectors.toList());
                                       
        invoices.forEach(System.out::println);
    }
}
