package assignment5;

public class Print_Sum_of_Natural_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num = 1;
		int sum = 0;
		while(num<=50)
		{
			sum = sum+num++;
		}
		System.out.println("Sum of first 50 natural numbers : "+ sum);
	}

}
