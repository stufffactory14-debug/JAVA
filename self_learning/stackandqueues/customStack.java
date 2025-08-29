package stackandqueues;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;
    public customStack() {
        this(DEFAULT_SIZE);
    }

    public customStack(int size) {
        this.data= new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full !");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr== data.length-1;
    }
    public boolean isEmpty() {
        return ptr== -1;
    }

    public int pop() throws stackException{
        if(isEmpty()){
            throw new stackException("cannont pop from empty stack");
        }
       /* int removed = data[ptr];
        ptr--;
        return removed;
        below line for simplicity
        */
        return data[ptr--];
    }
    public int peek() throws stackException{
        if(isEmpty()){
            throw new stackException("cannont peek from an empty stack");
        }
        return data[ptr];
    }

}
