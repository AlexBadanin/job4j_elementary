package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        // Formula for man's weight: (height in cm - 100) * 1.15
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        // Formula for woman's weight: (height in cm - 110) * 1.15
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        short womanHeight = 170;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Man 187 cm is " + man + " kg");
        System.out.println("Woman 170 cm is " + woman + " kg");
    }
}
