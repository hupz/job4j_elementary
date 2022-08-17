package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean abc = ab + ac > bc;
        boolean bca = ac + bc > ab;
        boolean cab = ab + bc > ac;
        return abc && bca && cab;
    }
}