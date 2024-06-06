import java.util.*;
class MyStack
{
    Stack<Integer> stack=new Stack<>();
    void push(int value)
    {
        stack.push(value);
        System.out.println(value+" pushed");
    }
    void pop()
    {
        int value=stack.pop();
        System.out.println(value+" Poped");
    }

}
public class stackBasicOp {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.stack);
        stack.pop();
        stack.push(4);
        stack.push(5);
        System.out.println(stack.stack);

    }
}
