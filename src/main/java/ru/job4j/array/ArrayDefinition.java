package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] numbers = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Dmitriy";
        names[1] = "Alexey";
        names[2] = "Anton";
        names[3] = "Maksim";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println("Размер массива равен: " + numbers.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
    }
}
