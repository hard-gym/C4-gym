import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        int[] nums={-1, 0, 1, 2, -1, -4};
        System.out.println(Arrays.toString(nums));
        threeSum(nums);
    }
    public static void threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        if(nums.length<3)
            System.out.println(ans);
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i]>0)
                System.out.println(ans);
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int l=i+1,r=nums.length-1;
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r&&nums[l]==nums[l+1]) l++;
                    while(l<r&&nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }
                else if(sum>0) r--;
                else l++;
            }
        }
        System.out.println(ans);
    }
}
