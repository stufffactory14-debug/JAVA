package stackandqueues;

public class stackmain {
    public static void main(String[] args) throws stackException {
        customStack stack = new dynamic_stack(5);
        stack.push(54);
        stack.push(76);
        stack.push(32);
        stack.push(154);
        stack.push(8);
        stack.push(1546);
        System.out.println(stack.pop());
    }
}
