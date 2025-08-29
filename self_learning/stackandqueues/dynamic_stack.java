package stackandqueues;

public class dynamic_stack extends customStack{

    public dynamic_stack() {
        super(); // this will call customStack()
    }

    public dynamic_stack(int size) {
        super(size); // this will call customStack(int size)
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];

            //copy all previous items into new data
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        //at this point array is not full
        //insert items
        return super.push(item);
    }

}
