import static org.junit.Assert.*;

public class TriangleTest {

    @org.junit.Test
    public void triangleType() {

        Triangle triangle = new Triangle ();
        assertEquals("Извините, треуголник с такими сторонами не существует", triangle.triangleType(0, 1, 1));
        assertEquals("Извините, треуголник с такими сторонами не существует", triangle.triangleType(2, 2, 4));
        assertEquals("Извините, треуголник с такими сторонами не существует", triangle.triangleType(7, 7, 14));
        assertEquals("Извините, треуголник с такими сторонами не существует", triangle.triangleType(100000, 100000, 200000));

        assertEquals("Треуголник равнобедренный", triangle.triangleType(3, 3, 5));
        assertEquals("Треуголник равнобедренный", triangle.triangleType(10, 10, 11));
        assertEquals("Треуголник равнобедренный", triangle.triangleType(500000, 500000, 600000));
        assertEquals("Треуголник равнобедренный", triangle.triangleType(1000000000, 1000000000, 888888888));

        assertEquals("Треуголник равносторонний", triangle.triangleType(1, 1, 1));
        assertEquals("Треуголник равносторонний", triangle.triangleType(10, 10, 10));
        assertEquals("Треуголник равносторонний", triangle.triangleType(700, 700, 700));
        assertEquals("Треуголник равносторонний", triangle.triangleType(900000000, 900000000, 900000000));

        assertEquals("Треугольник разносторонний", triangle.triangleType(5, 6, 7));
        assertEquals("Треугольник разносторонний", triangle.triangleType(100, 101, 102));
        assertEquals("Треугольник разносторонний", triangle.triangleType(900000000, 800000000, 1000000000));


    }
}