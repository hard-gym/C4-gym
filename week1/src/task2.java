import java.util.Scanner;

public class task2 {
    public static void main(String args[])
    {
        int count=0,b=0,a=0,c=0,m;
        for(m=100;m<1000;m++)
        {
            a=m/100;
            b=m%100/10;
            c=m%10;
            if(a*a*a+b*b*b+c*c*c==m)
            {
                count++;
            }
        }
        System.out.println("1000以内的水仙花数有："+count+"个");
    }
}
