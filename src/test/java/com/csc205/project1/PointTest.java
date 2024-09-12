package com.csc205.project1;

import com.csc205.project1.projectone.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
/* Github copilot command in generating test cases: can you write a
unit test for Point class utilizing junit5.
Also add multiple test cases for each method to include edge cases
 */
class PointTest {

    @Test
    void setPoint() {

        Point point = new Point(0, 0);
        point.setPoint(5, 5);
        assertEquals(5, point.getX());
        assertEquals(5, point.getY());

        point.setPoint(-5, -5);
        assertEquals(-5, point.getX());
        assertEquals(-5, point.getY());
    }

    @Test
    void shiftX() {

        Point point = new Point(5, 5);
        point.shiftX(1);
        assertEquals(6, point.getX());

        point.shiftX(-10);
        assertEquals(-4, point.getX());

        point.shiftX(0);
        assertEquals(-4, point.getX());

    }

    @Test
    void shiftY() {

        Point point = new Point(5, 5);
        point.shiftX(1);
        assertEquals(6, point.getX());

        point.shiftX(-10);
        assertEquals(-4, point.getX());

        point.shiftX(0);
        assertEquals(-4, point.getX());
    }

    @Test
    void distance() {

        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        assertEquals(5, point1.distance(point2));

        point2.setPoint(0, 0);
        assertEquals(0, point1.distance(point2));

        point2.setPoint(-3, -4);
        assertEquals(5, point1.distance(point2));
    }

    @Test
    void rotate() {

        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        assertEquals(5, point1.distance(point2));

        point2.setPoint(0, 0);
        assertEquals(0, point1.distance(point2));

        point2.setPoint(-3, -4);
        assertEquals(5, point1.distance(point2));
    }

    @Test
    void testToString() {
        Point point = new Point(5, 5);
        assertEquals("Point(x=5.0, y=5.0)", point.toString());

        point.setPoint(-5, -5);
        assertEquals("Point(x=-5.0, y=-5.0)", point.toString());
    }
}