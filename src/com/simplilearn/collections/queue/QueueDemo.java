package com.simplilearn.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		// Queue is a data structure which works in first in first out order (FIFO).
		// Queue Implementation class : Priority Queue.
		
		// Array Queue :  store data element into FIFO
		Queue<String> banKQueue = new ArrayDeque<String>();
		
		banKQueue.add("John");
		banKQueue.add("Mike");
		banKQueue.add("Wiliam");
		banKQueue.add("Vijay");
		banKQueue.add("Ibrahim");
		
		// peek an element -> get head of the queue
		System.out.println("Head -> "+banKQueue.peek());
		System.out.println("Head -> "+banKQueue.element());
		
		// remove peek element -> poll
		System.out.println("Head -> "+banKQueue.poll());
		System.out.println("Head -> "+banKQueue.peek());
		
		System.out.println("-------------------");
		
		// Queue : Priority Queue :: Does not order element FIFO
		Queue<String> filesQueue = new PriorityQueue<String>();
		
		filesQueue.add("file1");
		filesQueue.add("file2");
		filesQueue.add("file3");
		filesQueue.add("file4");
		
		System.out.println("Head -> "+filesQueue.peek());
		System.out.println("Head -> "+filesQueue.element());
		
		System.out.println("-------------------");
		// iterate over queue.
		for(String user : banKQueue) {
			System.out.println(user);
		}
		
	}

}
