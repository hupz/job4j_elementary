package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = isEmpty(name);
        if (valid) {
            int code = name.codePointAt(0);
            if (isDigit(code)) {
                return false;
            }
            if (isUpperLatinLetter(code)) {
                return false;
            }
        }
            if (valid) {
                for (int i = 1; i < name.length(); i++) {
                    int code = name.codePointAt(i);
                    if (!isUpperLatinLetter(code)
                            && !isLowerLatinLetter(code)
                            && !isSpecialSymbol(code)
                            && !isDigit(code)) {
                        valid = false;
                        break;
                    }
                }
            }

        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 65 && code < 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code > 97 && code < 122;
    }

    public static boolean isDigit(int code) {
        return code >= 48 && code <= 57;
    }

    public static boolean isEmpty(String name) {
        return name.length() != 0;
    }
}