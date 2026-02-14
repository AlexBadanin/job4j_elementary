package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitnesTest {

    @Test
    void whenIvan90Nik100() {
        int ivan = 90;
        int nik = 100;
        int expected = 1;
        int result = Fitnes.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIvan50Nik120() {
        int ivan = 50;
        int nik = 120;
        int expected = 3;
        int result = Fitnes.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIvan200Nik120() {
        int ivan = 200;
        int nik = 120;
        int expected = 0;
        int result = Fitnes.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }
}