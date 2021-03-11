import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(climb(n));
    }
    private static int climb(int n){
        if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else
            return climb(n-1)+climb(n-2);
    }
}
