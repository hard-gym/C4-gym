import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=in.nextInt();
        }
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=zuijin(nums[i]);
        }
        Arrays.sort(arr);
        int count=0;
        if(n%2==0) {
            for (int i = 0; i < n / 2; i++) {
                count+=arr[i];
            }
        }
        else{
            for (int i = 0; i < (n / 2)+1; i++) {
                count+=arr[i];
            }
        }
        System.out.println(count);
    }
    private static int zuijin(int n){
        double m=Math.sqrt(n);
        int num;
        num=(int)m;
        if(Math.abs(num*num-n)>Math.abs((num+1)*(num+1)-n)){
            return Math.abs((num+1)*(num+1)-n);
        }
        else {
            return Math.abs(num * num - n);
        }
    }
}
