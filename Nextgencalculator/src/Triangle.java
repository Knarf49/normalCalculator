import java.util.Scanner;
import java.lang.Math;

public class Triangle {
    Scanner sc = new Scanner(System.in);
    public static double FindArea(double base,double height)
    {
        double Area = 0.5 * base * height;
        return Area;
    }

    public static double pitagorus(double a,double b)
    {
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        return c;
    }

}
