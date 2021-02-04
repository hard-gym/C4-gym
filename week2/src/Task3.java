import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("输入:");
        String str=in.nextLine();
        System.out.println(findnumber(str));
    }
    public static String findnumber(String str)
    {
        String list="";
        int j;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='0'&&str.charAt(i)<='9')
        {
            j=i;
            for(;j<str.length();j++) {
                if(str.charAt(j)<'0'||str.charAt(j)>'9')
                {
                    i=j+1;
                    break;
                }
                else
                    list += str.charAt(j);
            }
            list+=",";
        }
        }
        list=list.substring(0,list.length()-1);
        return list;
    }
}