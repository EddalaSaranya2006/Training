package practice;
import java.util.Scanner;
public class grade {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter marks:");
        int marks=sc.nextInt();
        if(marks>90)
        {
            System.out.println("5 star");
        }
        else if(marks>80)
        {
            System.out.println("4 star");
        }
        else if(marks>70)
        {
            System.out.println("3 star");
        }
        else if(marks>50)
        {
            System.out.println("average student");
        }
        else
        {
            System.out.println("failed student:");
        }
        sc.close();
    }
}
