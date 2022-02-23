package array;

public class Example2 {
	public static boolean canBalance(int[] a)
	{
		// Write code here
		int sum1=0;
		int sum2=0;
		if(a.length%2==0)
		{
			for(int i=0;i<a.length/2;i++)
			{
				sum1 = sum1 + a[i];
			}
			for(int i=a.length/2;i<a.length;i++)
			{
				sum2 = sum2 + a[i];
			}
		}
		else
		{
			for(int i=0;i<=a.length/2;i++)
			{
				sum1 = sum1 + a[i];
			}
			for(int i=a.length/2+1;i<a.length;i++)
			{
				sum2 = sum2 + a[i];
			}
		}
		
		if(sum1==sum2)
			return true;
		else
			return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("{1, 1, 1, 2, 1} -> "+canBalance(new int[] {1, 1, 1, 2, 1}));
		System.out.println("{2, 1, 1, 2, 1} -> "+canBalance(new int[] {2, 1, 1, 2, 1}));
		System.out.println("{10, 10} -> "+canBalance(new int[] {10, 10}));
	}

}
