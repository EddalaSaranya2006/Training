class Student {
    String name;
    int age;
    String mood;
    int energy;
    float attendance;

    Student(String n, int a, String m, int e, float att) {
        this.name = n; 
        this.age = a;
        this.mood = m;
        this.energy = e;
        this.attendance = att;
    }

    public void skipClasses() {
        if (energy < 2) {
            System.out.println(name + " skips the class.");
        }
    }

    public void giveExam() {
        if (attendance > 85.0) {
            System.out.println(name + " is taking the test.");
        }
    }

    public void sleep() {
        if (mood=="bored") {
            System.out.println(name + " is feeling sleepy.");
        }
    }

    public void study() {
        if (mood=="ambitious") {
            System.out.println(name + " is studying.");
        }
    }

    public void eat() {
        if (energy < 3) {
            System.out.println(name + " is eating.");
        }
    }
}

class SuperStudents extends Student {
    String power;
    String hobby;

    SuperStudents(String n, int a, String m, int e, float att, String s, String h) {
        super(n, a, m, e, att);
        this.power = s;
        this.hobby = h; 
    } 
    public void codeAllNight() {
        if (power=="coding" && hobby=="interested") {
            System.out.println(name + " can code all night.");
        }
    }

    public void debug() {
        if (hobby=="interested" && power=="coding") {
            System.out.println(name + " can debug for 5 hours.");
        }
    }
}

public class Main1 {
    public static void main(String args[]) {
        SuperStudents s = new SuperStudents("Saranya", 20, "ambitious", 8, 90.00f, "coding", "interested");
        
        s.skipClasses();
        s.giveExam();
        s.study();
        s.sleep();
        s.eat();
        s.codeAllNight();
        s.debug();
    }
}
