import java.util.Arrays;

public class luoxuanmatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int r=matrix.length,c=matrix[0].length;
        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        dfs(0,0,r,c,matrix);
    }
    private static void dfs(int m,int n,int r,int c,int[][] matrix){
        for (int i = m; i < c-1; i++) {
            System.out.println(matrix[m][i]);
        }
        for (int i = n; i <r-1 ; i++) {
            System.out.println(matrix[i][c-1]);
        }
        for (int i = c-1; i>m ; i--) {
            System.out.println(matrix[r-1][i]);
        }
        for(int i=r-1;i>n;i--){
            System.out.println(matrix[i][m]);
        }
        if(r-2>=0&&c-2>=0){
            dfs(m+1,n+1,r-1,c-1,matrix);
        }
        else
            return;
    }
}
