public class max {
    public static void main(String args[])
    {
        int max=0;
        int min=99;
        int[] arr={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
            
        }
        System.out.println(max);
        System.out.println(min);

    }    
}
