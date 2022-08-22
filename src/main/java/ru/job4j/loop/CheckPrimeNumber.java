package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int num = 2; num <= number - 1; num++) {
            if ((number % num) == 0) {
                    break;
            }
            else {
                prime = true;
            }
            }
        return prime;
    }
}