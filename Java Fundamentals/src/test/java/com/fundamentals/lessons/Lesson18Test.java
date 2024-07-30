package com.fundamentals.lessons;

import com.fundamentals.House;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Lesson18Test {
    House myHouse;
    Lesson18 lessonTest;

    @BeforeEach
    void setUp() {
        lessonTest = new Lesson18();
    }

    @Test
    void testCalculateArea() {
        double actualArea = lessonTest.calculateArea(1);
        double expectedArea = 3.141592653589793;
        assertEquals(expectedArea, actualArea,
                "Value failed to match");
    }

    @Test
    void testCharExample() {
        char[] actual = lessonTest.myCharExample();
        char[] expected = "UnitTest".toCharArray();
        assertArrayEquals(expected, actual,
                "Arrays should be equal");
    }

    @Test
    void testIsGreaterTrue() {
        assertTrue(lessonTest.isGreaterExample(7,3));
    }

    @Test
    void testIsGreaterFalse(){
        assertFalse(lessonTest.isGreaterExample(3,7));
    }

    @Test
    void testHouseNull() {
        assertNull(lessonTest.myHouseExample(myHouse));
    }

    @Test
    void testHouseNotNull() {
        myHouse = new House();
        assertNotNull(lessonTest.myHouseExample(myHouse));
    }

} // end class scope
