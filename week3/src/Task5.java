import java.util.Scanner;
class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
public class Task5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入学生ID:");
        int id=in.nextInt();
        CheakID(id);
    }
    public static void CheakID(int id){
        if(id<0)
            try {
                throw new MyException("该ID不正确");
            } catch (MyException e) {
                e.printStackTrace();
                return;
            }
        System.out.println("恭喜您，注册成功");

    }
}
