import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int n=s.length();
        List<List<String>> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <=n; j++) {
                String str=s.substring(i,j);
                String[] sub=str.split(",");
                List<String> sublist=new ArrayList<>();
                sublist= Arrays.asList(sub);
                list.add(sublist);
            }
        }
        HashMap<List<String>,Integer> ans=new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
                ans.put(list.get(i),1);
        }
        System.out.println(ans.size());
    }
}
