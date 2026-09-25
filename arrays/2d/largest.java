public class largest {
    public static void main(String args[])
    {
        int max=Integer.MIN_VALUE;
         int[][] arr={{1,2,3},{4,5,6}};
         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr[i].length;j++)
            {
                max=Math.max(max,arr[i][j]);

            }
         }
         System.out.println(max);

    }
    
}
