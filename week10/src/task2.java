import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        System.out.println(yuesufu(n,m));
    }
    private static int yuesufu(int n,int m){
        List<Integer> start=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            start.add(i);
        }
        int count=0;
        while (start.size()>1){
            count+=m;
            count=count%start.size()-1;
            if(count<0){
                start.remove(start.size()-1);
                count=0;
            }
            else {
                start.remove(count);
            }
        }
        return start.get(0);
    }
}
