import java.util.HashMap;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入元素的个数:");
        int n=in.nextInt();
        System.out.println("输入元素:");
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=in.nextInt();
        }
        System.out.println(weiyihe(nums));
    }
    private static int weiyihe(int[] nums){
        int n=nums.length;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for (int i = 0; i < n; i++) {
            if(map.get(nums[i])==1){
                ans+=nums[i];
            }
        }
        return ans;
    }
}
