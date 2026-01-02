package assignment7;

public class Prime_Number_Check_Using_Method {
	static int isPrime(int num)
	{
		for(int i= 2;i<num;i++)
		{
			if(num%i==0)
				return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		if(isPrime(num) == 0)
			System.out.println("Prime Number");	
		else
			System.out.println("Not Prime Number");
	}

}
 