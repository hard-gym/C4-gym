import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double n=in.nextDouble();
        int step=0;
        double m=0;
        erjinzhi(m,n,step);
    }
    private static void erjinzhi(double m,double n,int step){
        step++;
        if(step>=32) {
            System.out.println("ERROR");
            return;
        }
        n=n*2;
        if(n>1){
            n=n-1;
            m=m+Math.pow(10,-step);
        }
        else if(n==1)
        {
            m=m+Math.pow(10,-step);
            System.out.println(m);
        }
        if(n<1)
            erjinzhi(m,n,step);
    }
}
