package array;

public class Example1 {

	public static int maxSpan(int[] a)
	{
		// Write code here
		int span=0;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					temp = j-i +1;
					if(temp>span)
					{
						span=temp;
					}
				}
			}
		}
		return span;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("{1, 2, 1, 1, 3} -> "+maxSpan(new int[] {1, 2, 1, 1, 3}));
		System.out.println("{1, 4, 2, 1, 4, 1, 4} -> "+maxSpan(new int[] {1, 4, 2, 1, 4, 1, 4}));
		System.out.println("{1, 4, 2, 1, 4, 4, 4} -> "+maxSpan(new int[] {1, 4, 2, 1, 4, 4, 4}));
		
	}

}
