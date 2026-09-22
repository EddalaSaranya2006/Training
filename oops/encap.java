class Student{
    private String name;
    public void setName(String n)
    {
        this.name=n;
    }
    public String getName()
    {
        return name;
    }
}
public class encap {
    public static void main(String args[])
    {
        Student s=new Student();
        s.setName("John");
        System.out.println(s.getName());
    }
    
}
