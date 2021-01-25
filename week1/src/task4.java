import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String args[])
    {
        int[] nums={0, 1, 0, 3, 12};
        System.out.println("输入:"+Arrays.toString(nums));
        for(int i=0;i< nums.length;i++)
        {
            if(nums[i]==0)
            {
                for(int j=i;j< nums.length-1;j++)
                {
                    int temp;
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println("输出:"+Arrays.toString(nums));
    }
}
