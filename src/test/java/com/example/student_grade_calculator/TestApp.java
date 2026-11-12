
package com.example.student_grade_calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestApp {

    @Test
    void testTotal() {
        int[] marks = {90, 80, 70, 85, 75};
        assertEquals(400, App.calculateTotal(marks));
    }

    @Test
    void testAverage() {
        int[] marks = {90, 80, 70, 85, 75};
        assertEquals(80.0, App.calculateAverage(marks));
    }

    @Test
    void testGrade() {
        assertEquals("A+", App.calculateGrade(95));
        assertEquals("A", App.calculateGrade(85));
        assertEquals("B", App.calculateGrade(75));
        assertEquals("F", App.calculateGrade(40));
    }
}
