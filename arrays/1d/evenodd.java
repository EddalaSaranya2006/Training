public class evenodd {
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5,6,7};

        int even=0;
        int odd=0;

        for(int a:arr)
        {
            if(a%2==0)
            {
                even+=1;
            }
            else
            {
                odd+=1;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
