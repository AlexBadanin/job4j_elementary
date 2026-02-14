package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void factorial12() {
        int input = 12;
        int expected = 479001600;
        int output = Factorial.calculate(input);
        assertThat(output).isEqualTo(expected);
    }

     @Test
    void factorial1() {
        int input = 1;
        int expected = 1;
        int output = Factorial.calculate(input);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void factorial5() {
        int input = 5;
        int expected = 120;
        int output = Factorial.calculate(input);
        assertThat(output).isEqualTo(expected);
    }

@Test
    void factorial10() {
        int input = 10;
        int expected = 3628800;
        int output = Factorial.calculate(input);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void factorial0() {
        int input = 0;
        int expected = 1;
        int output = Factorial.calculate(input);
        assertThat(output).isEqualTo(expected);
    }
}