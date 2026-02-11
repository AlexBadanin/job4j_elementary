package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLength2Don5AndWidth1Dot5ThenDiagonal2Dot91() {
        double length = 2.5;
        double width = 1.5;
        double expected = 2.91;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength4Don7AndWidth2Dot3ThenDiagonal5Dot23() {
        double length = 4.7;
        double width = 2.3;
        double expected = 5.23;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength18Don3AndWidth12Dot5ThenDiagonal22Dot16() {
        double length = 18.3;
        double width = 12.5;
        double expected = 22.16;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}