import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackOperations stack = new StackOperations(scan.nextInt());
        System.out.println(stack.topValue());
        System.out.println(stack.getSize());
        System.out.println(stack.isEmpty());
        stack.display();
        System.out.println(stack.isFull());
        stack.push('g');
        stack.push('s');
        stack.push('k');
        stack.push('a');
        stack.display();
        System.out.println(stack.isFull());
        System.out.println(stack.topValue());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());
    }
}
