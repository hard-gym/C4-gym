import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)==s.charAt(n-i-1))
                continue;
            else{
                String s1=s.substring(i,n-i-1);
                String s2=s.substring(i+1,n-i);
                if(judgehuiwen(s1)||judgehuiwen(s2)) {
                    System.out.println("true");
                    return;
                }
                else {
                    System.out.println("flase");
                    return;
                }
            }
        }
        System.out.println("true");
    }
    private static boolean judgehuiwen(String s){
        int n=s.length();
        boolean flag=true;
        for (int i = 0; i <n/2 ; i++) {
            if(s.charAt(i)!=s.charAt(n-1-i))
                flag=false;
        }
        return flag;
    }
}
