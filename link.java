public class link {

    public static void main(String args[])
    {

        Linked list=new Linked();

        list.inserthead(1);
        list.inserthead(2);
        list.inserthead(3);

        list.printList();

    }
    
}
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Linked
{
    Node head;
     Node tail;

     public void inserthead(int data)
     {
        Node newNode=new Node(data);

        if(head==null)
        {
            head=tail=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }

     }

     public void printList()
     {
        Node current=head;
        
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
     }
}
