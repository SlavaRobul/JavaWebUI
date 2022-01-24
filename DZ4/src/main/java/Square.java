import static java.lang.Math.sqrt;

public class Square {
    double getTriangleSquare(int a, int b, int c){
        if (!isTriangle(a, b, c)) {
            double p = (a + b + c) / 2;
            return sqrt(p * (p - a) * (p - b) * (p - c));
        } else{
            return -1;
        }
    }

    boolean isTriangle(int a, int b, int c){
        if ((a > b + c) || (b > a + c) || (c > a + b))
            return true;
        return false;
    }
}
