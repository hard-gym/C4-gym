import java.util.*;

public class task1 {
    public static void main(String[] args) {
        int[] nums=new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i]=(int)(1000*Math.random());
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(qian10num(nums)));
    }
    private static int[] qian10num(int[] nums){
        int[] ans=new int[10];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((Comparator<? super Map.Entry<Integer, Integer>>) new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (int i = 0; i < 10; i++) {
            ans[i]=list.get(i).getKey();
        }
        return ans;
    }
}
