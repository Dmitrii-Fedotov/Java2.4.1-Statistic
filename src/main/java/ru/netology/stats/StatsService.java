package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long avg(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthWithMax(long[] sales) {
        long max = getMax(sales);
        int monthCounter = 0;
        int monthWithMax = 0;
        for (long sale : sales) {
            monthCounter++;
            if (sale == max) {
                monthWithMax = monthCounter;
            }
        }
        return monthWithMax;
    }

    public long getMax(long[] sales) {
        long max = sales[0];
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int monthWithMin(long[] sales) {
        long min = getMin(sales);
        int monthCounter = 0;
        int monthWithMin = 0;
        for (long sale : sales) {
            monthCounter++;
            if (sale == min) {
                monthWithMin = monthCounter;
            }
        }
        return monthWithMin;
    }

    public long getMin(long[] sales) {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int monthCountMoreThanAvg(long[] sales) {
        long avg = avg(sales);
        int monthCount = 0;
        for (long sale : sales) {
            if (sale > avg) {
                monthCount++;
            }
        }
        return monthCount;
    }
    public int monthCountLessThanAvg(long[] sales) {
        long avg = avg(sales);
        int monthCount = 0;
        for (long sale : sales) {
            if (sale < avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

}
