public class rowsum {
    public static void main(String args[])
    {
        int k=0;
        int[] sums=new int[2];
         int[][] arr={{1,2,3},{4,5,6}};
         for(int i=0;i<arr.length;i++)
         {
            int sum=0;
            for(int j=0;j<arr[i].length;j++)
            {
                sum+=arr[i][j];
               
            

            }
             sums[k]=sum;
             k++;
         }for(int i=0;i<sums.length;i++)
         {
            System.out.println(sums[i]);
         }

    }
    
}
