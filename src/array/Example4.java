package array;

public class Example4 {

	public static void stateOfWakanda(int[][] a)
	{
		// Write code here
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<a.length;j++)
				{
					System.out.println(a[j][i]);
				}
			}
			else
			{
				for(int j=a.length-1;j>=0;j--)
				{
					System.out.println(a[j][i]);
				}
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("{{1,2,3},{4,5,6},{7,8,9}} -> ");
		stateOfWakanda(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
	}

}
