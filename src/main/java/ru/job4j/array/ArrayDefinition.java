package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] numbers = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[5];
        names[0] = "Dmitriy";
        names[1] = "Alexey";
        names[2] = "Anton";
        names[3] = "Maksim";
        names[4] = "Taras";
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("Размер массива равен: " + numbers.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
    }
}
