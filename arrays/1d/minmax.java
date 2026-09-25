public class minmax {

    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int a:arr)
        {
            max=Math.max(max,a);
            min=Math.min(min,a);
        }

        System.out.println(max);
        System.out.println(min);

    }
    
}
