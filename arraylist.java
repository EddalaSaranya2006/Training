
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> students=new ArrayList<>();


        students.add("hemanth");
        students.add("saranya");
        students.add("roopa");
        students.add("samyuktha");
        students.add("arun");


        System.out.println("Students: "+students);

        System.out.println("First Student: "+students.get(0));


        students.set(2, "Ashish");

        System.out.println("after update: "+students);

        //remove an element

        students.remove(3);

        System.out.println("after deleting: "+students);

        if(students.contains("hemanth"))
        {
            System.out.println("hemanth is present");
        }

        System.out.println("Total students: "+students.size());

        //last element
        System.out.println("last student is: "+students.getLast());


        
    }
    
}
