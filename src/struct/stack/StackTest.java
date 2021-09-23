package struct.stack;

public class StackTest {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

        stack.push(5);
        stack.push(45);
        stack.push(456);
        stack.push(5789);
        stack.push(45456);
        stack.push(456123);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.push(45);
        stack.push(456);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}
