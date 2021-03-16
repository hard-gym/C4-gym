import java.util.Arrays;
import java.util.Scanner;
//合并排序（归并排序）
public class hebing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入元素个数:");
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int[] tem=new int[n];
        mergeSort(nums,0,n-1,tem);
        System.out.println(Arrays.toString(nums));
    }
    private static void heibingpaixu(int[] nums,int low,int mid,int high,int[] tem){
        int i = 0;
        int j = low,k = mid+1;  //左边序列和右边序列起始索引
        while(j <= mid && k <= high){
            if(nums[j] < nums[k]){
                tem[i++] = nums[j++];
            }else{
                tem[i++] = nums[k++];
            }
        }
        //若左边序列还有剩余，则将其全部拷贝进tmp[]中
        while(j <= mid){
            tem[i++] = nums[j++];
        }

        while(k <= high){
            tem[i++] = nums[k++];
        }

        for(int t=0;t<i;t++){
            nums[low+t] = tem[t];
        }
    }

    public static void mergeSort(int[] arr,int low,int high,int[] tmp){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(arr,low,mid,tmp); //对左边序列进行归并排序
            mergeSort(arr,mid+1,high,tmp);  //对右边序列进行归并排序
            heibingpaixu(arr,low,mid,high,tmp);    //合并两个有序序列
        }
    }
}
