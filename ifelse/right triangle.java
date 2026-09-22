public class pattern1 {
    public static void main(String args[]) {
        int i,j;
        for(i=0;i<4;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<(4-1)*2-i*2;k++)
        {
            System.out.print(" ");
        }
            for (int l=0;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
