// (),{},[] -> YES
// [{}((]   -> NO

package stack;

import java.util.Scanner;

public class Example1 {
	
	char[] stack;
	int top;
	int capacity;
	
	Example1(int size)
	{
		stack = new char[size];
		top=-1;
		capacity = size;
	}
	
	void push(char value)
	{
		if(top== capacity-1)
		{
			
		}
		else
		{
			stack[++top] = value;
		}
	}
	 char pop()
	 {
		 return stack[top--];
	 }
	 // []{}
	 boolean isBalanced(String s)
	 {
		 if(s==null || s.length()%2 !=0)
		 {
			 return false;
		 }
		 else
		 {  
			 for(int i=0;i<s.length();i++)
			 {
				 char ch = s.charAt(i); //)
				 if(ch=='(' || ch=='{' || ch=='[')
				 {
					 push(ch);
				 }
				 else if(ch==')' || ch=='}' || ch==']')
				 {
					 if(top != -1)
					 {
						 char open = pop(); // open =[
						 if(open =='(' && ch !=')')
						 {
							 return false;
						 }
						 else if(open =='{' && ch !='}')
						 {
							 return false;
						 }
						 else if(open =='[' && ch !=']')
						 {
							 return false;
						 }
					 }
				 }
			 }
			 return top==-1;
		 }
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Example1 e = new Example1(s.length());
		if(e.isBalanced(s))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}

