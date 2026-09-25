class MyStack
{
    private int[] stack;

    int top;

    MyStack(int size)
    {
        stack=new int[size];
        top=-1;
    }

    void push(int value)
    {
        if(top==stack.length-1)
        {
            System.out.println("stack overflow");
            return;
        }

        top++;
        stack[top]=value;

        System.out.println(value +"pushed");
    }

    int pop()
    {
        if(top==-1)
        {
            System.out.println("stack underflow");

            return -1;

        }

        int value=stack[top];

        top--;

        return value;
    }

    int peek()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
            return -1;

        }
        return stack[top];
    }

    boolean isEmpty()
    {
        return top==-1;

    }

    boolean isFull()
    {
        return top==stack.length-1;

    }

    int size()
    {
        return top+1;
    }

    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--)
        {
            System.out.println("|"+stack[i]+"|");
        }
        System.out.println("-------");
    }

}
public class stack {

    public static void main(String args[])
    {
        MyStack stack=new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);


        System.out.println();

        stack.display();
        System.out.println();

        System.out.println(stack.peek());

        System.out.println();

        System.out.println(stack.size());

        System.out.println();

        System.out.println(stack.isEmpty());


        System.out.println();

        System.out.println(stack.isFull());


    }
    
}
