package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SavingsTest {

    @Test
    void whenGoal500Deposit100Percent5ThenYears5() {
        double goal = 500;
        double annualDeposit = 100;
        double percent = 5;
        int expected = 5;
        int result = Savings.years(goal, annualDeposit, percent);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenGoal100Deposit100Percent5ThenYears5() {
        double goal = 100;
        double annualDeposit = 100;
        double percent = 5;
        int expected = 1;
        int result = Savings.years(goal, annualDeposit, percent);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenGoal1000Deposit150Percent10ThenYears6() {
        double goal = 1000;
        double annualDeposit = 150;
        double percent = 10;
        int expected = 6;
        int result = Savings.years(goal, annualDeposit, percent);
        assertThat(result).isEqualTo(expected);
    }
}