import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<>();
		que.add("Apple");   //there is no difference between add and offer both of them does the same task
		que.offer("Banana");
		que.offer("Cherry");
		
		System.out.println(que.peek());        //peek and poll are differnt 
		while(!que.isEmpty()) {             // In PEEK the value is get and does not delete
			System.out.println(que.poll());   // In POLL the value is get and it  delete value
		}
		
	}

}
