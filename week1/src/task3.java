import java.util.Scanner;

public class task3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入:");
        String s = in.nextLine();
        int n = s.length();
        String m="";
        for (int i=0; i<n; i++)
        {
            m=s.charAt(i)+m;
        }
            System.out.println("输出:"+m);
    }
}
