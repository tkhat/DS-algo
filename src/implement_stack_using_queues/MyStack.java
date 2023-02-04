package implement_stack_using_queues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    Queue<Integer> startQueue;
    Queue<Integer> holder;
    public MyStack() {
        startQueue = new LinkedList<>();
        holder = new LinkedList<>();
    }

    public void push(Integer x) {
        startQueue.add(x);
    }

    int pop() {
        int last=0;
        int length = startQueue.size();
       for (int i = 0; i < length;i++){
           last = startQueue.poll();
           if (startQueue.size() != 0){
               holder.add(last);
           }
       }
        while (!holder.isEmpty()){
            startQueue.add(holder.poll());
        }
        return last;
    }
    int top(){
        int last =0;
        while (!startQueue.isEmpty()){
            last = startQueue.poll();
            holder.add(last);
        }
        while (!holder.isEmpty()){
            startQueue.add(holder.poll());
        }
        return last;
    }

    boolean empty(){
        return startQueue.isEmpty();
    }
}
