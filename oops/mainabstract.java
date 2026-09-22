abstract class animal{
    abstract void sound();
}
class Dog extends animal{
    void sound()
    {
        System.out.println("Dog barks");
    }
}
public class mainabstract {
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.sound();
    }
}
