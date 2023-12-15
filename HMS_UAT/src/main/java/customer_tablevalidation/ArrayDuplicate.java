package customer_tablevalidation;

import java.util.Arrays;

public class ArrayDuplicate
{	
	public static void main(String [] args)
	{
		int num[]= {11, 15, 19, 11, 12, 14, 14, 13,12};
		
//		for(int i=0; i<num.length; i++)
//		{
//			for(int j=i+1; j<num.length; j++)
//			{
//				if(num[i]==num[j])	
//				{
//					System.out.println(num[i]);
//				}
//			}
//		}
		
		Arrays.sort(num);
		
		for(int i=0; i<num.length-1; i++)
		{
			if(num[i]==num[i+1])
			{
				System.out.println(num[i]);
			}
		}
	}
	
}

