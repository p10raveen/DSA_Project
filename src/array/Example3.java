package array;

public class Example3 {

	public static int MostFrequentDigit(int[] a)
	{
		// Write code here
		int[] res = new int[10];
		
		/* 0    1   1   3   3   3   0   0   0   0
		 * ---------------------------------------
		 * 0	1	2	3	4	5	6	7	8	9
		 **/
		int num;
		for(int b: a)
		{
			num = b;
			while(num!=0)
			{
				int r = num%10;
				res[r]++;
				num = num/10;
			}
		}
		
		int max=-1;
		int index = 0;
		for(int i=0;i<res.length;i++)
		{
			if(res[i]>=max)
			{
				max = res[i];
				index = i;
			}
		}
		return index;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("{123, 234, 345, 673} -> "+MostFrequentDigit(new int[] {123, 234, 345, 673}));
		System.out.println("{123, 456, 345, 5043} -> "+MostFrequentDigit(new int[] {123, 456, 345, 5043}));
		System.out.println("{1023, 7624, 2046, 1052} -> "+MostFrequentDigit(new int[] {1023, 7624, 2046, 1052}));
		System.out.println("{1023, 456, 345, 1002} -> "+MostFrequentDigit(new int[] {1023, 456, 345, 1002}));
	}

}
