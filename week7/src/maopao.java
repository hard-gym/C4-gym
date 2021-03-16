import java.util.Arrays;
import java.util.Scanner;

public class maopao {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入元素个数:");
        int n=in.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i]=in.nextInt();
        }
        maopaopaixu(nums);
    }
    private static void maopaopaixu(int[] nums){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
