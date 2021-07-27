package queueExample;

public class QueueExample {
	
	
	private int[] array;
	private int  front;
	private int capacity;
	private int count;
	private int rearLast;
	
	
	public QueueExample(int size) {
		super();
		array = new int[size];
		front = 0;
		capacity =size;
		count =0;
		rearLast =-1;
		
	}
	
	
	
	
	public void enqueue(int value ) {
		
		if (isFull()) {
			System.out.println("Der Queue ist voll");
			System.exit(1);
			
		}
		
		rearLast = (rearLast+1)%capacity;
		
		array[rearLast]= value;
		count++;
		
		
	}
	
	
	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Es gibt keine Daten vorhanden");
			System.exit(1);
			
		}
		
		front = (front+1)%capacity;
		count--;
		
		
	}
	
	
	
	
	
	public int peek() {
		
		if (isEmpty()) {
         System.out.println("ES gibt keine Eintrag vorhanden");	
         System.exit(1);
		}
		
		return array[front];
		
		
	}
	
	
	
	
	public int size() {
		
		return count;
	}
	
	public boolean isEmpty() {
		
		
		return (size()==0);
	}
	
	
	
	public boolean isFull() {
		
		
		return (size()==capacity);
		
		
	}
	
	
	public void ausgeben() {
		
		for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+ " ");	
		}
		
	}
	
	
	public static void main(String...args) {
		
		QueueExample queueExample = new QueueExample(5);
		queueExample.enqueue(3);
		queueExample.enqueue(14);
		queueExample.enqueue(2);
		queueExample.enqueue(22);
		
		queueExample.dequeue();
		int value = queueExample.peek();
		
		System.out.println(value);
		
		queueExample.ausgeben();
		
	}
	
	
	
	

}
