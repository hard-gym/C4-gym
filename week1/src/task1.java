import java.util.Scanner;

public class task1 {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("输入体重（kg）：");
        double m= in.nextDouble();
        System.out.println("输入身高（m）：");
        double n= in.nextDouble();
        double BMI=m/(n*n);
        if(BMI<18.5)
            System.out.println("过轻");
        else if(BMI<=25)
            System.out.println("正常");
        else if(BMI<=28)
            System.out.println("过重");
        else if(BMI<=32)
            System.out.println("肥胖");
        else
            System.out.println("非常肥胖");
    }
}
