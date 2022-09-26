package ru.netology.stats;

public class StatsService {
    public long calculateSum(int[] values) {
        int month = 0;
        for (int value : values) {
            month += value;
        }
        return month;
    }

    public long calculateAverageSum(int[] values) {
        int averageMonth = 0;
        for (int value : values) {
            averageMonth += value;
        }
        averageMonth = averageMonth / 12;
        return averageMonth;
    }

    public long calculateMaxMonth(int[] values) {
        int monthMax = values[0];
        for (int value : values) {
            if (monthMax < value) {
                monthMax = value;
            }
        }
        return monthMax;
    }

    public long calculateMinMonth(int[] values) {
        int monthMin = values[0];
        for (int value : values) {
            if (monthMin > value) {
                monthMin = value;
            }
        }
        return monthMin;
    }

    public long calculateBelowAverage(int[] values) {
        int averageMonth = 0;
        for (int value : values) {
            averageMonth += value;
        }
        averageMonth = averageMonth / 12;
        int belowAverageMonth = 0;
        for (int value : values) {
            if (value < averageMonth) belowAverageMonth++;
        }
        return belowAverageMonth;
    }

    public long calculateAboveAverage(int[] values) {
        int averageMonth = 0;
        for (int value : values) {
            averageMonth += value;
        }
        averageMonth = averageMonth / 12;
        int aboveAverageMonth = 0;
        for (int value : values) {
            if (value >= averageMonth) aboveAverageMonth++;
        }
        return aboveAverageMonth;
    }
}


