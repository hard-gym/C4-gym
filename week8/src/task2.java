import java.util.Stack;

public class task2 {
    public static void main(String[] args) {
        int[] pushed={1,2,3,4,5};
        int[] poped={4,5,3,2,1};
        System.out.println(judgezhan(pushed,poped));
    }
    private static boolean judgezhan(int[] pushed,int[] poped){
        Stack<Integer> zhan=new Stack<>();
        int i=0;
        for (int num : pushed) {
            zhan.push(num);
            while(!zhan.isEmpty()&&zhan.peek()==poped[i]){
                i++;
                zhan.pop();
            }
        }
        return zhan.isEmpty();
    }
}
