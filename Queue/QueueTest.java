import java.util.Scanner;

public class QueueTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QueueOperations queue = new QueueOperations(5);
        System.out.println(queue.frontElement());
        System.out.println(queue.getSize());
        System.out.println(queue.isEmpty());
        queue.display();
        System.out.println(queue.isFull());
        queue.enqueue('g');
        queue.enqueue('s');
        queue.enqueue('k');
        queue.enqueue('a');
        queue.display();
        System.out.println(queue.isFull());
        System.out.println(queue.frontElement());
        System.out.println(queue.rearElement());
        System.out.println(queue.dequeue());
        queue.display();
        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());
    }
}
