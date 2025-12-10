package javastream;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Create a stack of strings
        Stack<String> stack = new Stack<>();

        // push() – add elements (LIFO)
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack: " + stack);

        // peek() – see top element
        System.out.println("Top element: " + stack.peek());

        // pop() – remove top element
        String removed = stack.pop();
        System.out.println("Popped element: " + removed);

        System.out.println("Stack after pop: " + stack);

        // Check if empty
        System.out.println("Is stack empty? " + stack.empty());

        // Search element (1-based position from top)
        int pos = stack.search("Java");
        System.out.println("Position of 'Java' from top: " + pos);
    }
}
