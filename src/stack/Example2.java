package stack;

import java.util.Scanner;

public class Example2 {
	char[] stack;
	int top;
	int capacity;
	
	Example2(int size)
	{
		stack = new char[size];
		top = -1;
		capacity = size;
	}
	
	void push(char c)
	{
		if(top == capacity-1)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			stack[++top] = c;
		}
	}
	
	char pop()
	{
		return stack[top--];
	}
	
	char peek()
	{
		return stack[top];
	}
	
	int precedence(char c)
	{
		if(c == '^' || c =='$')
			return 3;
		else if(c == '*' || c == '/')
			return 2;
		else
			return 1;
	}
	//        A - B / ( C * D )
	String convertPostfix(String infix)
	{
		String postfix = ""; // result
		
		for(int i=0;i<infix.length();i++)
		{
			char symbol = infix.charAt(i); 
			
			if(Character.isLetter(symbol))
			{
				postfix = postfix + symbol;
			}
			else if(symbol=='(')
			{
				push(symbol);
			}
			else if(symbol == ')')
			{
				
				while(top !=-1 && peek()!='(' )
				{
					postfix = postfix + pop();
				}
				if(top!=-1)
				pop();
			}
			else
			{
				while(top!=-1 && (precedence(symbol) <= precedence(peek()) && peek() != '('))
				{
					postfix = postfix + pop();
				}
				push(symbol);
			}
		}
		while(top != -1)
		{
			postfix = postfix + pop();
		}
		
		return postfix;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Infix Expression: ");
		String infix = sc.nextLine();
		
		Example2 ip = new Example2(infix.length());
		System.out.println(ip.convertPostfix(infix));
	}

}

