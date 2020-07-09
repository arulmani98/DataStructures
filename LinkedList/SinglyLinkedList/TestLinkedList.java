public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("IsEmpty before Insertion = "+list.isEmpty());
        System.out.println("add value 1 = "+list.addAtLast(1));
        System.out.println("add value 2 = "+list.addAtLast(2));
        System.out.println("add value 3 = "+list.addAtLast(3));
        System.out.println("add value 4 = "+list.addAtLast(4));
        System.out.println("add value 5 = "+list.addAtLast(5));
        System.out.println("add value 6 = "+list.addAtLast(6));
        System.out.println("add value 7 = "+list.addAtLast(7));
        System.out.println("add front 8 = "+list.addAtFront(8));
        System.out.println("head  : "+list.headValue());
        list.display();
        System.out.println("size = "+list.size());
        System.out.println("List before removal");
        list.display();
        System.out.println("remove 5 "+list.removeSpecific(5));
        System.out.println("remove by index "+list.remove(0));
        System.out.println("List After removal");
        list.display();
        System.out.println("get the 2nd element "+list.get(2));
        System.out.println("IsEmpty = "+list.isEmpty());
        try {
            System.out.println("Contains 10 ? " + list.contains(10));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("contains 2 ? "+list.contains(2));
        System.out.println("contains 6 ? "+list.contains(6));
        list.display();
        list.reverseList();
        System.out.println("After Reverse ");
        list.display();
        System.out.println("Clear the list "+list.clear());
        System.out.println("list is Empty ? "+list.isEmpty());
    }
}
