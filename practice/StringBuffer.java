package practice;

public class StringBuffer {
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Java");

        System.out.println("Original: "+sb);

        //append
        sb.append("Programming");

        System.out.println("after append:"+sb);

        //insert
        sb.insert(5, "is");

        System.out.println("After insert: "+sb);

        //replace 
        sb.replace(6,10,"love");

        System.out.println("After replace: "+sb);

        //delete 
        sb.delete(2,3);

        System.out.println("After delete: "+sb);

        //reverse
        sb.reverse();
        String result = sb.toString();
        System.out.println("After reversing:"+result);

        System.out.println(sb.capacity());

        System.out.println(sb.charAt(2));

        System.out.println(sb.indexOf("J"));

        System.out.println(sb.lastIndexOf("program"));

    }
}
