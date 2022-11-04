package ru.javaschool.test.calculator;

public enum romanNumb {
    I("I", 1), II("II", 2), III("I", 3), IV("I", 4), V("I", 5), VI("I", 6), VII("I", 7), VIII("I", 8), IX("I", 9), X("I", 10);



    private int value;
    private String key;
    romanNumb(String key, int value) {
        this.value = value;
        this.key = key;
    }

    public int getValue() {
        return value;
    }
    public String getKey() {
        return key;
    }



}
