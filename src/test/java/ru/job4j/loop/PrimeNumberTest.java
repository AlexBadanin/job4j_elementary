package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void when200Then46() {
        int finish = 200;
        int expected = 46;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when3Then2() {
        int finish = 3;
        int expected = 2;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2Then1() {
        int finish = 2;
        int expected = 1;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when500Then95() {
        int finish = 500;
        int expected = 95;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when7Then4() {
        int finish = 7;
        int expected = 4;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }
}