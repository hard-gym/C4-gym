import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;

public class task1 {
    public static void main(String[] args) {
        int[] nums1={1,3,5,2,4};
        int[] nums2={6,5,4,3,2,1,7};
//        int[] nums1={4,1,2};
//        int[] nums2={1,3,4,2};
//        int[] nums1={2,4};
//        int[] nums2={1,2,3,4};
        System.out.println(Arrays.toString(dandiaozhan(nums1,nums2)));
    }
    private static int[] dandiaozhan(int[] nums1,int[] nums2){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        int len1=nums1.length,len2=nums2.length;
        for(int i=0;i<len2;i++){
            if(deque.isEmpty())
                deque.addLast(nums2[i]);
            else if(deque.peekLast()<nums2[i]){
                while (!deque.isEmpty()){
                    if(deque.peekLast()<nums2[i]) {
                        map.put(deque.removeLast(), nums2[i]);
                    }
                }
                deque.addLast(nums2[i]);
            }
            if(deque.peekLast()>nums2[i]&&!deque.isEmpty()){
                deque.addLast(nums2[i]);
            }
        }
        int[] ans=new int[len1];
        for (int i = 0; i < len1; i++) {
            ans[i]=-1;
            if(map.containsKey(nums1[i])){
                ans[i]=map.get(nums1[i]);
            }
        }
        return ans;
    }
}
