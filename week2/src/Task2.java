import java.util.Arrays;

public class Task2 {
    public static void main(String args[])
    {
        String[] list={"flow","flight","flower"};
        System.out.println("输入:"+Arrays.toString(list));
        System.out.println("输出:"+findthelongest(list));
    }
    public static String findthelongest(String list[])
    {
        if(list.length==0)
            return "";
        String str=list[0];
        int j,i;
        for(i=1;i< list.length;i++)
        {
            j=0;
            for(;j< str.length();j++)
            {
                if(str.charAt(j)!=list[i].charAt(j))
                    break;
            }
            str=str.substring(0,j);
            if(str.equals(""))
                return str;
        }
            return str;
    }
}
