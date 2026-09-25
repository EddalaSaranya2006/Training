import java.util.*;
public class arrays {

    public static void main(String args[])
    {

        ArrayList<String> students=new ArrayList();

        students.add("Ramu");
        students.add("Saranya");
        students.add("Hemadri");
        students.add("Thulasi");
        students.add("Mowsmwe");
        students.add("Lakshmi");

        System.out.println("Students: "+students);

        students.sort(new Comparator<String>(){
            @Override
            public int compare(String a, String b)
            {
                return b.compareTo(a);
            }
        });
       System.out.println("After Sorting: " + students);

       students.set(1,"Mounika");

       System.out.println("setting element at a index: "+students);

       students.remove("Mounika");

       System.out.println("after removing the element: "+students);

       students.clear();

       System.out.println("after clearing the array: "+students);






    }
    
}
