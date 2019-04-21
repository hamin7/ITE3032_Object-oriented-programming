package handout1;

public class Handout1
{
	public static void main(String arg[])
	{
		int k = 5;
		int k2 = (k-1);
		int k1 = k;

		boolean rpt = true;

		for(int i = 1 ; i <=k ; i++)
		{
			int num = i;
			for(int j = 1 ; j <= k1 ; j++)
			{
				if(j <= k2)
				{
					System.out.print(" ");
				}
				else
				{
					if(num >= 1)
					{
						System.out.print(num--);
					}
				}
			}
			for(int n = 2 ; n <= i ; n++)
			{
				System.out.print(n);
			}
			k2--;
			k1++;
			System.out.println();
		}
	}
}
