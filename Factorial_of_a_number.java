package assignment5;

public class Factorial_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num = 6;    // if we want use bigger number use data type int/double
		short temp = num; // if we want use bigger number use data type int/double
		int sum = 1;      // if we want use bigger number use data type double
		while(num !=0)
		{
			sum = sum *num--;			
		}
		System.out.println("Factorioal of "+temp+" is : "+sum);
	}
}
