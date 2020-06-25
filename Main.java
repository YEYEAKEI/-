package CSP;


import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n = in.nextInt();
			int count = 0;
			int[] num = new int[4];
			int j = 0;
			for(int i=1;count<=n;i++)
			{
				if(seven(i))
				{
					j++;
					count++;
					if(j == 4) 
						j = 0;
				}
				else
				{
					num[j]++;
					j++;
					if(j == 4)
						j = 0;
				}
			}
			
			for(int k=0;k<4;k++)
			{
				System.out.println(num[k]);
			}
		}
	}
	
	public static boolean seven (int num)
	{
		if(num % 7 == 0 || num % 10 == 7)  return false;
		
		num /= 10;
		
		while(num>0)
		{
			if(num % 10 == 7)
				return false;
			num /= 10;
		}
		return true;
		
	}
	
}
