package Queue;

import java.util.PriorityQueue;

public class PriorityQ {
	void show() {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(23);
		pq.add(14);
		pq.add(45);
		pq.add(35);
		System.out.println(pq);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQ q=new PriorityQ();
		q.show();
	}

}
