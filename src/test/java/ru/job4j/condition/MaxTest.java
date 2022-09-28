package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax6To3Then6() {
    int left = 6;
    int right = 3;
    int result = Max.max(left, right);
    int expected = 6;
    assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To9Then9() {
        int left = 1;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To6To1To9Then9() {
        int left = 4;
        int right = 6;
        int second = 1;
        int first = 9;
        int result = Max.max(left, right, second, first);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To6To1Then6() {
        int left = 4;
        int right = 6;
        int second = 1;
        int result = Max.max(left, right, second);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}