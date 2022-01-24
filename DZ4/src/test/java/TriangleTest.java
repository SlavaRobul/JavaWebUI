import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TriangleTest {
    @Test
    public void test1(){
        var x = new Square();
        double res = x.getTriangleSquare(1, 2, 3);
        assertEquals(0, res);
    }

    @Test
    public void test2(){
        var x = new Square();
        double res = x.getTriangleSquare(10, 2, 3);
        assertEquals(-1, res);
    }

    @Test
    public void test3(){
        var x = new Square();
        double res = x.getTriangleSquare(3, 4, 5);
        assertEquals(6, res);
    }
}
