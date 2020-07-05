public class StackOperations implements StackInterface {
    private int top = -1;
    private int size;
    Object[] stack;
    public StackOperations(int size){
        this.size = size;
        stack = new Object[size];
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean isEmpty() {
        if(top==-1)
            return true;
        else
            return false;
    }

    @Override
    public boolean isFull() {
        if(top==size-1)
            return true;
        else
            return false;
    }

    @Override
    public boolean push(Object var1) {
        if(isFull()){
            return false;
        }
        else
        {
            top++;
            stack[top] = var1;
            return true;
        }
    }

    @Override
    public Object pop() {
        Object temp;
        if(isEmpty()){
            return false;
        }
        else{
            temp = stack[top];
            top--;
            return temp;
        }
    }

    @Override
    public Object top() {
        if(isEmpty())
        {
            return null;
        }
        else{
            return stack[top];
        }
    }

    @Override
    public void display() {
        if(!isEmpty())
        {
            int i;
            for(i=top;i>=0;i--){
                System.out.print(stack[i]+" ");
            }
        }
        else{
            System.out.println("Stack is Empty");
        }
    }
}
