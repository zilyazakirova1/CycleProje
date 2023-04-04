package ru.netology.services;

public class monthsCalcService {
    public int calculate(int income, int expenses, int treshold) {
        int myMoney = 0;
        int count = 0;
        for (int month = 2; month <= 12; month++) {
            if (myMoney >= treshold) {
                myMoney = (myMoney - expenses) / 3;
                count++;
                System.out.println("Rest!");
            } else{
                myMoney = myMoney + income - expenses;//work
            }
            System.out.println("month "+month+ "; myMoney "+myMoney+ "; count "+count);
        }
        return count;
    }
}
