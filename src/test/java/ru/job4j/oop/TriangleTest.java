package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 8;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when00and04and40Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        Point c = new Point(4, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 8;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when00and100and010Then50() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 10);
        Point c = new Point(10, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 50;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when500and04and04ThenMinus1() {
        Point a = new Point(50, 0);
        Point b = new Point(0, 4);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = -1;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }
}