package queue;

public class Example1 {

	int[] queue;
	int front,rear;
	int capacity;
	
	Example1(int size)
	{
		queue = new int[size];
		front=-1;
		rear=-1;
		capacity = size;
	}
	
	boolean isFull()
	{
		return front==0 && rear == capacity-1;
	}
	
	boolean isEmpty()
	{
		return front==-1;
	}
	
	void enqueue(int value)
	{
		if(isFull())
		{
			System.out.println("Queue Overflow");		}
		else
		{
			if(isEmpty())
			{
				front=0;
			}
			rear++;
			queue[rear] = value;
		}
	}
	
	int dequeue()
	{
		int value;
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else
		{
			value = queue[front];
			if(front==rear)
			{
				front=-1;
				rear =-1;
			}
			else
			{
				front++;
			}
			return value;
		}
	}
	 void display()
	 {
		 for(int i=front;i<=rear;i++)
		 {
			 System.out.print(queue[i]+"\t"); 
		 }
		 System.out.println(); 
	 }
	
	public static void main(String[] args) {
		Example1 e = new Example1(5);
		e.enqueue(10);
		e.enqueue(20);
		e.enqueue(30);
		e.enqueue(40);
		e.enqueue(50);
		e.display();
		
		e.dequeue();
		e.dequeue();
		e.display();
		
		e.enqueue(50);
		e.display();
	}

}
