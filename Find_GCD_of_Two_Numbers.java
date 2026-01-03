package assignment7;

public class Find_GCD_of_Two_Numbers {
	static int findGCD(int a, int b)
	{
		int max = 0;
		for(int i =1;i<=(a+b)/2;i++)
		{
			if(a%i==0 && b%i==0)
				max=i;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =24, b=36;
		System.out.println(findGCD(a,b));

	}

}
