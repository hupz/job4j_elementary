package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        float in = 140;
        float expected = 2;
        float expectedTwo = 2.3333333f;
        float outTwo = Converter.rubleToDollar(in);
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        boolean passedTwo = expectedTwo == outTwo;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("140 rubles are 2.3333333. Test result : " + passedTwo);
    }
}
