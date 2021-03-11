import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        char[] s=String.valueOf(n).toCharArray();
        if(n>0&&n<Math.pow(2,31)-1){
            for(int i=0;i<s.length/2;i++){
                char temp=s[i];
                s[i]=s[s.length-i-1];
                s[s.length-i-1]=temp;
            }
            System.out.println(s);
        }
       else if(n<0&&n>Math.pow(-2,31)){
            for(int i=1;i<(s.length+1)/2;i++){
                char temp=s[i];
                s[i]=s[s.length-i];
                s[s.length-i]=temp;
            }
            System.out.println(s);
        }
       else
            System.out.println(0);
    }
}
