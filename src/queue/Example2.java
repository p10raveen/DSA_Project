package queue;

public class Example2 {

	int[] queue;
	int front,rear;
	int capacity;
	
	Example2(int size)
	{
		queue = new int[size];
		front=-1;
		rear = -1;
		capacity=size;
	}
	
	void enqueu(int value)
	{
		if(front==0 && rear==capacity-1 || front==rear+1)
		{
			System.out.println("Queue Overflow");
		}
		else
		{
			if(front==-1)
			{
				front=0;
			}
			rear = rear+1 %capacity;
			queue[rear]= value;	
		}
	}
	
	int dequeue()
	{
		int element;
		if(front==-1)
		{
			return -999;
		}
		else
		{
			element = queue[front];
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front = front+1 % capacity;
			}
			return element;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
