import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        String[] words={"cat","dog","nana","walk","walker","dogwalker"};
        System.out.println(Arrays.toString(words));
        System.out.println(longwords(words));
    }
    private static String longwords(String[] words){
        int n=words.length;
        int[] len=new int[n];
        for (int i = 0; i < n; i++) {
            len[i]=words[i].length();
        }
        Arrays.sort(len);
        int m=n-1;
        for(int i=n-1;i>=0;i--){
            if(words[i].length()==len[m]){
                if(findlongword(words,words[i])) {
                    return words[i];
                }
            }
            m--;
        }
        return null;
    }
    private static boolean findlongword(String[] words,String s){
        int n=s.length();
        int m=words.length;
        boolean flag=false;
        for(int i=2;i<n-1;i++){
            String s1=s.substring(0,i);
            String s2=s.substring(i,n);
            for (int j = 0; j < m; j++) {
                if(words[j].equals(s1)) {
                    for (int k = 0; k < m; k++) {
                        if (words[k].equals(s2))
                            flag=true;
                    }
                }
            }
        }
        return flag;
    }
}
