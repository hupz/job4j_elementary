package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        result = n == 0 || n == 1 ? 1 : result;
        return result;
    }
}
