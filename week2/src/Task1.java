import java.util.Arrays;

public class Task1{
    public static void main(String args[])
    {
        int[][] matrix={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println("输入:");
        for(int i=0;i< matrix.length;i++)//matrix.length返回matrix的行数
        {
            System.out.println(Arrays.toString(matrix[i]));
        }
        int[][] Matrix=new int[matrix.length][matrix.length];//构造一个和matrix结构相同的零矩阵
        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j< matrix.length;j++)
            {
                Matrix[j][matrix.length - i - 1]=matrix[i][j];//通过数学关系算出旋转后矩阵在原来矩阵中的对应位置
            }
        }
        System.out.println("输出:");
        for(int i=0;i< Matrix.length;i++)
        {
            System.out.println(Arrays.toString(Matrix[i]));
        }
    }
}
