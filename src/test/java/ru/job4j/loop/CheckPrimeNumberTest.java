package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CheckPrimeNumberTest {

    @Test
    void when5ToTrue() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    void when13ToTrue() {
        int number = 13;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    void when139ToTrue() {
        int number = 139;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    void when14ToFalse() {
        int number = 14;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void when356ToFalse() {
        int number = 356;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }
}