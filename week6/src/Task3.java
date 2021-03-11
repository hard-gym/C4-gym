import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入数组的长度:");
        int n=in.nextInt();
        int[] nums=new int[n];
        System.out.println("请输入每个元素的值:");
        for (int i = 0; i < n; i++) {
            nums[i]=in.nextInt();
        }
        System.out.println(emulate(nums));
    }
    private static List<List<Integer>> emulate(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        for (Integer num : nums) {
            int size=ans.size();
            for (int i = 0; i < size; i++) {
                List<Integer> sub=new ArrayList<Integer>(ans.get(i));
                sub.add(num);
                ans.add(sub);
            }
        }
        return ans;
    }
}
