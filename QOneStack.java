package GeeksForGeeks;
import java.util.Stack;
public class QOneStack {// class of queue having two stacks
    static class Queue {
        Stack<Integer> stack1;
    }
    static void push(Stack<Integer> top_ref, int new_data) {
        top_ref.push(new_data); // put in the data
    }
    static int pop(Stack<Integer> top_ref) {
        if (top_ref == null) {
            System.out.println("Stack Underflow");
            System.exit(0);
        }
        return top_ref.pop();
    }
    static void enQueue(Queue q, int x) {
        push(q.stack1, x);
    }
    static int deQueue(Queue q) {
        int x, res = 0;
        if (q.stack1.isEmpty()) {
            System.out.println("Q is Empty");
            System.exit(0);
        }
        else if (q.stack1.size() == 1) {   // Check if it is a last element of stack
            return pop(q.stack1);
        }
        else {
            x = pop(q.stack1);
            System.out.println("After first pop x is: " + x);
            System.out.println("After first pop res is: " + res);

            res = deQueue(q);   // store the last deQueued item
            System.out.println("After first recursion res is: " + res);

            push(q.stack1, x);  // push everything back to stack1
            System.out.println("After first push x is: " + x);
            return res;
        }
        return 0;
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.stack1 = new Stack<Integer>();
        enQueue(q, 1);
        enQueue(q, 2);
        enQueue(q, 3);
        System.out.print(deQueue(q) + " first dequeue\n");
        System.out.print(deQueue(q) + " second dequeue\n");
        System.out.print(deQueue(q) + " third dequeue\n");
    }
}