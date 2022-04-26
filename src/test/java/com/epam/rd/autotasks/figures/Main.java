package com.epam.rd.autotasks.figures;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        double a = sqrt(2)*sqrt(2);

        System.out.println(roundTo2DecimalPlace(a));

    }
    public static double roundTo2DecimalPlace(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
