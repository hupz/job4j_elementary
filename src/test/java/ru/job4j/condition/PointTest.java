package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point point = new Point(0, 0);
        Point point1 = new Point(2, 0);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to21then0() {
        double expected = 0;
        Point point = new Point(2, 1);
        Point point1 = new Point(2, 1);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when51to32then2dot23() {
        double expected = 2.23;
        Point point = new Point(5, 1);
        Point point1 = new Point(3, 2);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when43to22then2dot23() {
        double expected = 2.23;
        Point point = new Point(4, 3);
        Point point1 = new Point(2, 2);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when434to224then2dot23() {
        double expected = 2.23;
        Point point = new Point(4, 3, 4);
        Point point1 = new Point(2, 2, 4);
        double out = point.distance3d(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

}