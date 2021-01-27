import java.util.Scanner;

class Circle{
    double r;
    public void getArea()
    {
        System.out.println("the area is "+(3.14*r*r));
    }
    public void getPerimeter()
    {
        System.out.println("the perimeter is "+(2*3.14*r));
    }
}
public class task5 {
    public static void main(String args[])
    {
        Circle Cir=new Circle();
        System.out.println("输入:");
        Scanner in=new Scanner(System.in);
        Cir.r= in.nextDouble();
        System.out.println("输出:");
        Cir.getArea();
        Cir.getPerimeter();
    }
}
