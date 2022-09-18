package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] array = new int[bound];
        for (int index = 0; index < bound; index++) {
            array[index] = index * index;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
