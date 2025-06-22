package com.cognizant;

public class FinancialFind {

    // Recursive approach
    public static double futureValueRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return futureValueRecursive(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Iterative approach
    public static double futureValueIterative(double presentValue, double growthRate, int years) {
        double value = presentValue;
        for (int i = 0; i < years; i++) {
            value *= (1 + growthRate);
        }
        return value;
    }

    // Direct formula-based approach
    public static double futureValueDirect(double presentValue, double growthRate, int years) {
        return presentValue * Math.pow(1 + growthRate, years);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05;
        int years = 10;

        // Calculating future values
        double recursiveResult = futureValueRecursive(presentValue, growthRate, years);
        double iterativeResult = futureValueIterative(presentValue, growthRate, years);
        double directResult = futureValueDirect(presentValue, growthRate, years);

        // Output
        System.out.println("==== Financial Forecasting Tool ====\n");

        System.out.printf("Present Value : $%.2f\n", presentValue);
        System.out.printf("Growth Rate   : %.2f%%\n", growthRate * 100);
        System.out.printf("Years         : %d\n", years);

        System.out.println("\n---- Future Value Calculation ----");
        System.out.printf("Recursive Result : $%.2f\n", recursiveResult);
        System.out.printf("Iterative Result : $%.2f\n", iterativeResult);
        System.out.printf("Direct Formula   : $%.2f\n", directResult);

    }
}
