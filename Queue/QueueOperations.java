public class QueueOperations<E> implements QueueInterface{
    private int size;
    private int front = -1;
    private int rear = -1;
    Object[] queue;
    QueueOperations(int size){
        this.size = size;
        this.queue = new Object[this.size];
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(front==-1)
            return true;
        else
            return false;
    }

    @Override
    public boolean isFull() {
        if(rear==size-1)
            return true;
        else
            return  false;
    }

    @Override
    public boolean enqueue(Object var1) {
        if(!isFull()) {
            if (rear == -1) {
                rear = front = 0;
                queue[rear] = var1;
                return true;
            }
            else {
                rear++;
                queue[rear]=var1;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object dequeue() {
        if(!isEmpty()){
            if(front==rear){
                Object obj = queue[front];
                front=rear=-1;
                return obj;
            }
            else{
                Object obj = queue[front];
                front++;
                return obj;
            }
        }
        return null;
    }

    @Override
    public Object frontElement() {
        if(!isEmpty())
        {
            return queue[front];
        }
        return null;
    }

    @Override
    public Object rearElement() {
        if(!isEmpty())
        {
            return queue[rear];
        }
        return null;
    }

    @Override
    public void display() {
        if(!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i]+" ");
            }
            System.out.println("");
        }
        else{
            System.out.println("Queue is Empty");
        }
    }
}
