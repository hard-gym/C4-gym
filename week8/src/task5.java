import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("数组的大小:");
        int n=in.nextInt();
        int[] nums=new int[n];
        System.out.println("数组内的元素:");
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(weiyi(nums));
    }
    private static int weiyi(int[] nums){
        int max=0,n=nums.length;
        int l=0;
        while(l<n){
            int count=0;
            if(nums[l]==1){
                count++;
                for(int r=l+1;r<n;r++){
                    if(nums[r]==1)
                        count++;
                    else{
                        l=r;
                        break;
                    }
                }
            }
            max=Math.max(count,max);
            l++;
        }
        return max;
    }
}
