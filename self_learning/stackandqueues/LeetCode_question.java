package stackandqueues;
import java.util.Stack;



//QUEUE USING STACK ( INSERTION O(1) REMOVAL O(N) LINER TIME COMPLEXITY )
 class MyQueue{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first=new Stack<>();
        second=new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }
    public int remove() throws Exception{

        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed= second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public int peek(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peek = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peek;
    }
    public boolean empty(){
        return first.isEmpty();
    }
}

//remove efficient
class MyQueuee{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueuee() {
        first=new Stack<>();
        second=new Stack<>();
    }

    public void add(int item){
        while(!first.isEmpty()){
            second.push(first.pop());

        }
        first.push(item);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int remove(){
        return first.pop();
    }
    public int peek(){
        return first.peek();
    }
    public boolean empty(){
        return first.isEmpty();
    }
}


//88 LEETCODE HARD QUESTION(ASKED IN GOOGLE)
class Main {
    public static void main(String[] args) {

    }

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);

        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }

        int i = heights.length;
        while (!stack.isEmpty()) {
            max = getMax(heights, stack, max, i);
        }

        return max;
    }

    private static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();
        if (stack.isEmpty()) {
            area = arr[popped] * i;
        } else {
            area = arr[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max, area);
    }
}