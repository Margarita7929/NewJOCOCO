package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxOneSumNegative() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 3, 8, 23, -23, 10};
        long expected = 23;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxIfAllSumsNegative() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-5, -30, -8, -23, -230, -100};
        long expected = -5;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}


