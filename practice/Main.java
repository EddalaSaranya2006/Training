class Student{
    String name;
    int age;
    String mood;
    int energy;
    float attendance;
    Student(String n, int a, String m, int e, float att)
    {
        this.name=n; 
        this.age=a;
        this.mood=m;
        this.energy=e;
        this.attendance=att;
    }
    public void skipClasses(){
        if(energy<2)
        {
            System.out.println("skip the class:");
        }
    }
    public void giveExam()
    {
        if(attendance>85.0)
        {
            System.out.println("i am taking test");
        }
    }
    public void sleep()
    {
        if(mood=="bored")
        {
            System.out.println("i am feeling sleepy");
        }
    }
    public void study()

    {
        if(mood=="ambitious")
        {
            System.out.println("i am studying");
        }
    }
    public void eat()
    {
        if(energy<3)
        {
            System.out.println("i am eating");
        }
    }
}
class SuperStudents extends Student{
    String power;
    String hobby;
    SuperStudents(String n, int a, String m, int e, float att, String s,String h){
    super(n,a,m,e,att);
    this.power=s;
    this.hobby=h;
    }
        
    }
    public void codeAllNight()
    {
        if(power=="coding")
        {
            System.out.println("student can code all night");
        }
    }
    public void debug()
    {
        if(hobby=="interested")
        {
            System.out.println("student can debug for 5 hours");
        }
    }

public class Main{
   public static void main(String args[])
    {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter the name,age,mood,energy,attendance");
        String name=sc.nextLine();
        int age=sc.nextInt();
        sc.nextLine();
        String mood=sc.nextLine();
        int energy=sc.nextInt();
        float attendance=sc.nextFloat();
        sc.nextLine();
        String superpower=sc.nextLine();
        sc.nextLine();
        String hobbies=sc.nextLine();*/


        SuperStudents s=new SuperStudent("saranya", 20, "ambitious", 8, 90.00, "coding", "interested");
        /*s.name="saranya";
        s.age=20;
        s.mood="happy";
        s.energy=5;
        s.attendance=90.0f;*/
        s.skipClasses();
        s.giveExam();
        s.study();
        s.sleep();
        s.eat();
        s.codeAllNight();
        s.debug();




        
    }
}
