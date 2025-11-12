package queue;

import java.util.LinkedList;
import java.util.Queue;

public class interleave_2half_ofqueue {

    static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
    InterLeave(q1);

    }
    static void InterLeave(Queue<Integer> q){
        Queue<Integer> q2 = new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
    }
}
