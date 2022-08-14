package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        int maximum = max(4, 5);
        System.out.println(maximum);
    }

    public static int max(int left, int right) {
        return left > right ? left : right;
    }
}
