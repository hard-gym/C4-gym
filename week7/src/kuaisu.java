import java.util.Arrays;
import java.util.Scanner;

public class kuaisu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入元素个数:");
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        kuaisupaixu(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
    }
    private static void kuaisupaixu(int[] nums,int low,int high){
        if(low>high)
            return;
        int l=low,r=high;//定义l和r分别指向最左边和最右边
        int base=nums[low];//将基准值设置为第一个数
        while(l<r){//将l指针与r指针分别向右和向左检索，当检索到排序错误值时将两值进行交换
            if(nums[r]>=base&&l<r){
                r--;
            }
            if(nums[l]<=base&&l<r){
                l++;
            }
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
        }//退出循环时即l与r相遇
        nums[low]=nums[l];//将相遇元素值赋值给基准值
        nums[l]=base;//将基准值赋值给相遇时元素的值
        kuaisupaixu(nums,low,l-1);//排基准数的左边
        kuaisupaixu(nums,r+1,high);//排基准数的右边
    }
}
