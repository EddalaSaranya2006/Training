public class first {
    public static void main(String args[])
    {
        class animal{
            void sound()
            {
                System.out.println("the animal is");
            }
        }
        class dog extends animal{
            @Override 
            void sound(){
                System.out.println("Dog is barking");
            }
        }
       /*animal a=new animal();
        a.sound();*/
        dog d=new dog();
        d.sound();
    }
        
  
}
