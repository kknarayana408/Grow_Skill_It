package assignment7;

public class Fibonacci_Series_Using_Method {
	static void printFibonacci(int num)
	{
		int num1 = 0;
		int num2 = 1;
		while(num-->2)
		{
		int result =(num1+num2);
		num1=num2;
		num2=result;
		System.out.print(result+ " ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =7;
		System.out.print("0 1 ");
		printFibonacci(n);
		}

}
