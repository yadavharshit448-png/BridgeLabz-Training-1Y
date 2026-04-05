package com.gla.wrapperclasses;

/**
 * Scenario 4. Bank Transaction Limits
 * Method returns remaining limit. Handles null limit by returning 0.0.
 */
public class S4_BankTransactionLimits {
    public static double getRemainingLimit(Double currentLimit, double usedAmount) {
        // Auto-unboxing and handling null
        double limit = (currentLimit != null) ? currentLimit : 0.0;
        return limit - usedAmount;
    }

    public static void main(String[] args) {
        System.out.println("Remaining (Limit: 1000.0, Used: 200.0): " + getRemainingLimit(1000.0, 200.0));
        System.out.println("Remaining (Limit: null, Used: 50.0)   : " + getRemainingLimit(null, 50.0));
    }
}
