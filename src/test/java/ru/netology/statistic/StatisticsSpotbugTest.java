package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsSpotbugTest {
    @Test
    void findMax() {
        StatisticsSpotbug service = new StatisticsSpotbug();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxElse() {
        StatisticsSpotbug service = new StatisticsSpotbug();

        long[] incomesInBillions = {4, 5, 9, 6, 15, 13, 18, 6, 7, 2, 12};
        long expected = 18;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
