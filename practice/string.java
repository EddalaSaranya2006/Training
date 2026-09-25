package practice;

public class string {
    public static void main(String args[])
    {
        String str="Java Programming";
        System.out.println("Original: "+str);

        //length
        System.out.println("length: "+str.length());

        //character at index
        System.out.println("cjaracter at index 2: "+str.charAt(2));

        //upper case
        System.out.println("Upper case: "+str.toUpperCase());

        //Lower case
        System.out.println("Lower case : "+str.toLowerCase());

        //equals'
        System.out.println("equlals: "+str.equals("java programming"));

        //equla ignore case
        System.out.println("equlas ignore case: "+str.equalsIgnoreCase("java programming"));

        ///contains
        System.out.println("contains: "+str.contains("Java"));

        //starts with
        System.out.println("starts with: "+str.startsWith("J"));

        //ends with
        System.out.println("ends with: "+str.endsWith("g"));

        //substring
        System.out.println("substring: "+str.substring(1,5));

        //inde of
        System.out.println("index of: "+str.indexOf("i"));

        //last index of
        System.out.println("las index of: "+str.lastIndexOf("a"));

        //replace
        System.out.println("replace: "+str.replace("a", "v"));

        //trim
        System.out.println("trim: "+ str.trim());

        //split
        String[] arr=str.split("a");
        //System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //System.out.println(arr[4]);
        




    }
}
