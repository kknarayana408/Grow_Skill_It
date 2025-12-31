package assignment6;

public class Sum_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 101;
		int orginal_value = num;
		int sum = 0;
		while(num>0)
		{
			int last_digit = num%10;
			sum = sum+last_digit;
			num = num/10;
		}
		System.out.println("Sum of Digits of "+orginal_value+" is : "+sum);
	}

}
