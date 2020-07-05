import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackOperations stack = new StackOperations(scan.nextInt());
        System.out.println(stack.getSize());
        stack.push('a');
        stack.push('g');
        stack.push('j');
        stack.pop();
        stack.push('k');
        stack.display();
    }
}
