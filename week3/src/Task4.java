import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(findnum(s));
    }
    private static HashMap<String,Integer> findnum(String s){
        HashMap<String,Integer> ans=new HashMap<>();
        String[] m=s.split("");
        for(int i=0;i<s.length();i++)
        {
            if(ans.containsKey(m[i]))
                ans.put(m[i],ans.get(m[i])+1);
            else
                ans.put(m[i],1);
        }
        return ans;
    }
}
