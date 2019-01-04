package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<Integer> qn= new LinkedList<Integer>();

		qn.add(67);
		qn.add(98);
		qn.add(34);
		qn.add(78);
		qn.add(9);
		System.out.println("Integer Queue ");




		System.out.println(qn.peek());
		System.out.println(qn.poll());
		System.out.println(qn.peek());
		System.out.println(qn.remove());
		System.out.println(qn.peek());



		System.out.println("Use of for each loop to retrieve data: ");
		for (Integer in : qn) {
			System.out.println(in);
		}


		System.out.println("Use of while loop to retrieve data: ");
		Iterator itr = qn.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}


	}

}
