class Node{
    Object data;
    Node next;
}
class LinkedList implements List{

    Node head;

    public boolean isEmpty() {
        if(head == null)
            return true;
        return false;
    }

    public boolean add(Object var1) {
        Node node = new Node();
        node.data = var1;
        node.next = null;
        if(head == null){
            head = node;
            return true;
        }
        else{
            Node n = head;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
            return true;
        }
    }

    public boolean clear() {
        head = null;
        return true;
    }

    public int size() {
        int count = 1;
        if(head == null){
            return 0;
        }
        else{
            Node node = head;
            while(node.next!=null){
                count++;
                node = node.next;
            }
            return count;
        }
    }

    public Object get(int var1) {
        if(head!=null) {
            int count = -1;
            Node node = head;
            while (node.next != null) {
                count++;
                if (count == var1) {
                    return node.data;
                }
                node = node.next;
            }
            count++;
            if (count == var1) {
                return node.data;
            }
            return null;
        }
        else{
            return null;
        }
    }

    public boolean contains(Object var1) {
        Node node = head;
        if(head == null){
            return false;
        }
        else {
            while (node.next != null) {
                if (node.data == var1) {
                    return true;
                }
                node = node.next;
            }
            if (node.data == var1) {
                return true;
            }
            return false;
        }
    }


    public boolean removeSpecific(Object var1) {
        Node node = head;
        if(head == null){
            return false;
        }
        else {
            if (node.data == var1) {
                Node currentNode = head;
                Node nextNode = currentNode.next;
                head = nextNode;
                currentNode.next = null;
                return true;
            } else {
                Node previousNode = null;
                while (node.data != var1) {
                    previousNode = node;
                    node = node.next;
                }
                if (node.next == null) {
                    previousNode.next = null;
                    return true;
                }
                previousNode.next = node.next;
                return true;
            }
        }
    }



    public Object remove(int var1) {
        if(head!=null) {
            Node previousNode = head;
            if (var1 == 0) {
                Node currentNode = head;
                Node nextNode = currentNode.next;
                head = nextNode;
                currentNode.next = null;
                return currentNode.data;
            }
            for (int i = 0; i < var1 - 1; i++) {
                previousNode = previousNode.next;
            }
            Node currentNode = previousNode.next;
            previousNode.next = currentNode.next;
            currentNode.next = null;
            return currentNode.data;
        }
        else{
            return null;
        }
    }


    public void reverseList() {
        if(head!=null)
        {
            Node prev = null;
            Node current = head;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
        else{
            System.out.println("List is Empty");
        }
    }


    public void display() {
        Node node = head;
        if(head == null){
            System.out.println("List is empty");
        }
        else {
            System.out.print("List : ");
            while (node.next != null) {
                System.out.print(" "+node.data);
                node = node.next;
            }
            System.out.println(" "+node.data);
        }
    }

    public void rotate(int var1){
        if(head != null){
            int count = 1;
            Node node = head;
            Node tail = null;
            while(node.next!=null){
                if(count==var1){
                    tail = node;
                }
                node = node.next;
                count++;
            }
            node.next = head;
            head = tail.next;
            tail.next = null;
            System.out.println("rotation complete");
        }
    }

}