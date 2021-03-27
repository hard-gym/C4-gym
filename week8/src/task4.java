import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("数组的大小:");
        int n=in.nextInt();
        int[] nums=new int[n];
        System.out.println("数组内的元素:");
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println("k的值:");
        int k=in.nextInt();
        System.out.println(huachuang(nums,k));
    }
    private static ArrayList<Integer> huachuang(int[] nums, int k){
        ArrayList<Integer> ans=new ArrayList<>();
        int n=nums.length;
        for (int i = 0; i <=n-k; i++) {
            int index=i;
            int max=nums[index];
            while(index<i+k-1){
                if(nums[index+1]>max)
                    max=nums[index+1];
                index++;
            }
            ans.add(max);
        }
        return ans;
    }
}
