package ru.netology.stats.ZhukovDZ6.services;

public class StatsService {
    public long sumAllSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long averageSalesAmount(long[] sales) {
        long average = sumAllSales(sales);
        for (long sale : sales) {
            average = sumAllSales(sales) / 12;
        }
        return average;
    }

    public long maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long minSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        long monthsBelowAverage = averageSalesAmount(sales);
        int numberOfMonths = 0;

        for (long sale : sales) {
            if (sale < monthsBelowAverage) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public int aboveAverageSales(long[] sales) {
        long monthsAboveAverage = averageSalesAmount(sales);
        int numberOfMonths = 0;

        for (long sale : sales) {
            if (sale > monthsAboveAverage) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}