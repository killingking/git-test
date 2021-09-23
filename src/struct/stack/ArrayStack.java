package struct.stack;

public class ArrayStack {
    int arrStack[];
    int top;
    int buttom;
    String str = "1+2+3";

    public ArrayStack(int size) {
        this.arrStack = new int[size];
        top = -1;
        buttom = -1;
    }

    public void push(int elme) {
        //压栈的前提是栈未满;
        if (isFull()) {
            System.out.println("无法添加,栈已满");
            return;
        }
        arrStack[++top] = elme;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("栈已经空,无法出栈");
            return -1;
        }
        return arrStack[top--];
    }

    public boolean isFull() {
 /*       if (top == arrStack.length - 1) {
            return true;
        }
        return false;*/
        return top == arrStack.length - 1;
    }

    public boolean isEmpty() {
/*        if (top == -1) {
            return true;
        }
        return false;*/
        return top == -1;
    }
}
