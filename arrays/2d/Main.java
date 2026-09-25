public class Main {
    public static void main(String args[])
    {
        int [][] nums=new int[3][4];
        nums[0][1]=3;
        nums[0][2]=4;
        nums[0][3]=6;

        nums[1][0]=4;
        nums[1][2]=5;
        nums[1][3]=7;

        nums[2][0]=2;
        nums[2][1]=5;
        nums[2][3]=9;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                System.out.println(nums[i][j]);
            }
        }


    }
    
}
