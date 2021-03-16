import java.util.Arrays;
import java.util.Scanner;

public class charu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入元素个数:");
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        charupaixu(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void charupaixu(int[] nums) {
        int n = nums.length;
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}
