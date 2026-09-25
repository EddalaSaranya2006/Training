public class reverse1 {
    public static void main(String args[])
    {
        int k=0;
       
        int[] arr={1,2,3,4,5,6};
         int[] rev=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
           
            rev[k]=arr[i];
            k++;
    

            
        }
        for(int r:rev)
        {
            System.out.println(r);
        }
    }
    
}
