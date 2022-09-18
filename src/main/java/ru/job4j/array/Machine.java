package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] array = new int[100];
        int size = 0;
        int smallChange = money - price;
        for (int coin : coins) {
            while (smallChange >= coin) {
                smallChange -= coin;
                array[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(array, size);
    }
}