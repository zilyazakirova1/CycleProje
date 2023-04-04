//package ru.netology.services;
package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class monthsCalcServiceTest {
    @Test
    public void shoudCalcMonthsCount1() {
        monthsCalcService service = new monthsCalcService();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthsCount2() {
        monthsCalcService service = new monthsCalcService();
        
        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }
}