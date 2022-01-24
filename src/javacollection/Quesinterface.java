package javacollection;

import java.util.PriorityQueue;

public class Quesinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue p = new PriorityQueue();

p.add("omkar");
p.add("onkar");
p.add("123");
p.add("onkar");
p.add("onkar");
p.add("place");
System.out.println(p);

//System.out.println(p.offer("omionkar"));// add object and provide boolean o/p if added.
//System.out.println(p.offer("321@omi"));
System.out.println("peek operation = "+p.peek()+"element oeratoion ="+p.element());// no element in queue peek shows NULL, where element shows no element exception
System.out.println("poll oerration"+" "+p.poll());//remove head element and return removed element no element then throws NULL
System.out.println("Result after poll" +p);
System.out.println("remove element"+"= "+p.remove());
System.out.println("result after remove ="+p);
//System.out.println(p.peek());// provide head of the queue


	}

}
