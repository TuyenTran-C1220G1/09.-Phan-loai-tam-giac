import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testClassifyTriangleEquilateral() {
        long side1 = 2;
        long side2 = 2;
        long side3 = 2;
        String expected = "equilateral triangle";
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangleIsosceles() {
        long side1 = 2;
        long side2 = 2;
        long side3 = 3;
        String expected = "isosceles triangle";
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle() {
        long side1 = 3;
        long side2 = 4;
        long side3 = 5;
        String expected = "triangle";
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyNotTriangle1() {
        long side1 = 8;
        long side2 = 2;
        long side3 = 3;
        String expected = "not a triangle";
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyNotTriangle2() {
        long side1 = -1;
        long side2 = 2;
        long side3 = 1;
        String expected = "not a triangle";
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyNotTriangle3() {
        long side1 = 0;
        long side2 = 1;
        long side3 = 1;
        String expected = "not a triangle";
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }
}