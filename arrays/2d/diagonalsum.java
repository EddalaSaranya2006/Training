public class diagonalsum {
    public static void main(String args[])
    {
        int sum=0;
        int[][] nums={{1,2,3},{4,5,6}};
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i][i];
        }

        System.out.println(sum);
    }
    
}
