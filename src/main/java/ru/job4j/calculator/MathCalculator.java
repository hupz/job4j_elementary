package ru.job4j.calculator;


import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceNumbers(double first, double second) {
        return difference(first, second);
    }

    public static double dividingNumbers(double first, double second) {
        return dividing(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceNumbers(10, 20));
        System.out.println("Результат расчета равен: " + dividingNumbers(10, 20));
    }
}