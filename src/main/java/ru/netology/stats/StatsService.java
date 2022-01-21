package ru.netology.stats;

public class StatsService {

    // 1. Сумма всех продаж
    public int calculateSumSales(int[] sales) {
        int sumSales = 0;
        for (int sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    // 2. Средняя сумма продаж в месяц
    public int calculateAverageSales(int[] sales) {
        return calculateSumSales(sales) / sales.length;
    }

    // 3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int calculateMaxSalesMonth(int[] sales) {
        int currentMax = sales[0];
        int monthNumber = 0;
        int monthSalesMax = 0;
        for (int sale : sales) {
            if (currentMax < sale) {
                currentMax = sale;
            }
            monthNumber++;
            if (sale == currentMax) {
                monthSalesMax = monthNumber;
            }
        }
        return monthSalesMax;
    }

    // 4. Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int calculateMinSalesMonth(int[] sales) {
        int currentMin = sales[0];
        int monthNumber = 0;
        int monthSalesMin = 0;
        for (int sale : sales) {
            if (currentMin > sale) {
                currentMin = sale;
            }
            monthNumber++;
            if (sale == currentMin) {
                monthSalesMin = monthNumber;
            }
        }
        return monthSalesMin;
    }

    // 5. Кол-во месяцев, в которых продажи были ниже среднего
    public int calculateMonthsBelowAverageSales(int[] sales) {
        int months = 0;
        for (int sale : sales) {
            if (sale < calculateAverageSales(sales)) {
                months++;
            }
        }
        return months;
    }

    // 6. Кол-во месяцев, в которых продажи были выше среднего
    public int calculateMonthsAboveAverageSales(int[] sales) {
        int months = 0;
        for (int sale : sales) {
            if (sale > calculateAverageSales(sales)) {
                months++;
            }
        }
        return months;
    }
}




