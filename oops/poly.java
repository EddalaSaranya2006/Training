class addition{
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    double add(int a, double b)
    {
        return a+b;
    }
}
public class poly {
    public static void main(String args[])
    {
        addition a=new addition();
        System.out.println(a.add(10,20));
        System.out.println(a.add(10,20,30));
        System.out.println(a.add(10,20.5));
    }
    
}
