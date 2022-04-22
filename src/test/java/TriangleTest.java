
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;



/*public class TriangleTest {

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
*/

@RunWith(value = Parameterized.class)
//@Category(UnitTest.class)
public class TriangleTest {
    @Parameters
    public static Collection<Object[]> data1(){
        return Arrays.asList(new Object[][]{
                {0, 1, 1, "Извините, треуголник с такими сторонами не существует"},
                {2, 2, 4, "Извините, треуголник с такими сторонами не существует"},
                {7, 7, 14, "Извините, треуголник с такими сторонами не существует"},
                {100000, 100000, 200000, "Извините, треуголник с такими сторонами не существует"}

        });
    }

    @Parameters
    public static Collection<Object[]> data2(){
        return Arrays.asList(new Object[][]{
                {3, 3, 5, "Треуголник равнобедренный"},
                {10, 10, 11, "Треуголник равнобедренный"},
                {500000, 500000, 600000, "Треуголник равнобедренный"},
                {1000000000, 1000000000, 888888888, "Треуголник равнобедренный"}

        });
    }

    @Parameters
    public static Collection<Object[]> data3(){
        return Arrays.asList(new Object[][]{
                {1, 1, 1, "Треуголник равносторонний"},
                {10, 10, 10, "Треуголник равносторонний"},
                {700, 700, 700, "Треуголник равносторонний"},
                {900000000, 900000000, 900000000, "Треуголник равносторонний"}

        });
    }

    @Parameters
    public static Collection<Object[]> data4(){
        return Arrays.asList(new Object[][]{
                {5, 6, 7, "Треугольник разносторонний"},
                {100, 101, 102, "Треугольник разносторонний"},
                {700, 700, 700, "Треугольник разносторонний"},
                {900000000, 800000000, 1000000000, "Треугольник разносторонний"}

        });
    }

    private final Triangle triangle;
    private final int a;
    private final int b;
    private final int c;
    private final String expectedResult;

    public TriangleTest(int a, int b, int c, String expectedResult){
        this.triangle = new Triangle();
        this.a = a;
        this.b = b;
        this.c = c;
        this.expectedResult = expectedResult;
}

    @Test
    public void shouldReturnCorrectResult(){
        String actualResult = triangle.triangleType(a,b,c);
        assertEquals(expectedResult, actualResult);
    }


}
