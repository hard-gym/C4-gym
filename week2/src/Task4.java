import java.util.Scanner;

class game{
    private int v=100;
    public void guess(){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        if(m<v)
        {
            System.out.println("猜小了，再试一下");
            guess();
        }
        else if(m>v)
        {
            System.out.println("猜大了，再试一下");
            guess();
        }
        else
        {
            System.out.println("恭喜你猜对了");
        }
    }
}
public class Task4 {
    public static void main(String args[]){
        System.out.println("请输入一个数:");
        game a=new game();
        a.guess();
    }
}
