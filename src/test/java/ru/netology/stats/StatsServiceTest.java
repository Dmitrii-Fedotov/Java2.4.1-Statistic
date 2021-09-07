package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldSum() {
        long actual = service.sum(sales);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void shouldAvg() {
        assertEquals(15, service.avg(sales));
    }

    @Test
    void shouldMonthWithMax() {
        assertEquals(8, service.monthWithMax(sales));
    }

    @Test
    void shouldMonthWithMin() {
        assertEquals(9, service.monthWithMin(sales));
    }

    @Test
    void shouldMonthCountMoreThanAvg() {
        assertEquals(5, service.monthCountMoreThanAvg(sales));
    }

    @Test
    void shouldMonthCountLessThanAvg() {
        assertEquals(5, service.monthCountLessThanAvg(sales));
    }

}