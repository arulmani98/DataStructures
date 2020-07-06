import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackOperations stack = new StackOperations(scan.nextInt());
        System.out.println(stack.getSize());
        System.out.println(stack.isEmpty());
        stack.display();
        System.out.println(stack.isFull());
        stack.push('a');
        stack.push('g');
        stack.push('j');
        stack.push('l');
        System.out.println(stack.topValue());
        stack.display();
        System.out.println(stack.top());
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());
    }
}
