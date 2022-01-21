package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    // 1. Сумма всех продаж
    @Test
    void calculateSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSumSales(sales);
        assertEquals(expected, actual);
    }

    // 2. Средняя сумма продаж в месяц
    @Test
    void calculateAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverageSales(sales);
        assertEquals(expected, actual);
    }

    // 3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    @Test
    void calculateMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.calculateMaxSalesMonth(sales);
        assertEquals(expected, actual);
    }

    // 4. Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    @Test
    void calculateMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.calculateMinSalesMonth(sales);
        assertEquals(expected, actual);
    }

    // 5. Кол-во месяцев, в которых продажи были ниже среднего
    @Test
    void calculateMonthsBelowAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMonthsBelowAverageSales(sales);
        assertEquals(expected, actual);
    }

    // 6. Кол-во месяцев, в которых продажи были выше среднего
    @Test
    void calculateMonthsAboveAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMonthsAboveAverageSales(sales);
        assertEquals(expected, actual);
    }
}
