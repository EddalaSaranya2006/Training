import java.util.LinkedList;
public class link2 {

    public static void main(String args[])
    {
        LinkedList<String> students=new LinkedList<>();

        students.add("saranya");
        students.add("hemadri");
        students.add("thulasi");
        students.add("mowsme");

        System.out.println(students);


        students.addFirst("rama");
        students.addLast("krishna");

        System.out.println(students);

        System.out.println("First : "+students.getFirst());
        System.out.println("Last: "+students.getLast());

        students.removeFirst();
        System.out.println("after removing the first element: "+students);
        students.removeLast();
        System.out.println("after removing last elelemnt: "+students);

    }
    
}
