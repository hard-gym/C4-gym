import java.util.Scanner;

class imaginenum
{
    int a,b,c,d;
    public void add()
    {
        if(b+d>0)
    {
        System.out.println("两复数的相加结果为:"+(a+c)+"+"+(b+d)+"i");
    }
        else
    {
        System.out.println("两复数的相加结果为:"+(a+c)+"-"+Math.abs(b+d)+"i");
    }
    }
    public void reduce()
    {
        if(b-d>0)
        {
            System.out.println("两复数的相加结果为:"+(a-c)+"+"+(b-d)+"i");
        }
        else
        {
            System.out.println("两复数的相加结果为:"+(a-c)+"-"+Math.abs(b-d)+"i");
        }
    }
    public void multiply()
    {
        if(a*d+b*c>0)
            System.out.println("两复数的相乘结果为:"+(a*c-b*d)+"+"+(a*d+b*c)+"i");
        else
            System.out.println("两复数的相乘结果为:"+(a*c-b*d)+"-"+Math.abs(a*d+b*c)+"i");
    }
}
public class task7 {
public static void main(String args[])
{
    System.out.println("输入:");
    Scanner in=new Scanner(System.in);
    imaginenum num=new imaginenum();
    num.a=in.nextInt();
    num.b=in.nextInt();
    num.c=in.nextInt();
    num.d=in.nextInt();
    System.out.println("输出:");
    num.add();
    num.reduce();
    num.multiply();
}
}
