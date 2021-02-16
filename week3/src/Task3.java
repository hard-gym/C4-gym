import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(dr(s));
    }
    private static LinkedHashSet<String> dr(String s)
    {
        LinkedHashSet<String> ans=new LinkedHashSet<>();
        String[] m=s.split("");//将字符串转换为字符串数组 s.split表示将字符串中每一个字符用""划分开来
        for(int i=0;i<s.length();i++)
        {
            ans.add(m[i]);
        }
            return ans;
    }
}
