package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int values[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(values);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();
        int values[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverageSum(values);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxMonth() {
        StatsService service = new StatsService();
        int values[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;
        long actual = service.calculateMaxMonth(values);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinMonth() {
        StatsService service = new StatsService();
        int values[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.calculateMinMonth(values);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateBelowAverage() {
        StatsService service = new StatsService();
        int values[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateBelowAverage(values);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAboveAverage() {
        StatsService service = new StatsService();
        int values[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.calculateAboveAverage(values);
        assertEquals(expected, actual);
    }

}
