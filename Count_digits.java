package assignment5;

public class Count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 45678;// if we want use bigger number use data type double
		int temp = num;
		short count = 0;
		for(;num>0;)
		{
			num = num/10;
			count++;
		}
		System.out.println("No of digits in " + temp+" is : "+count);
	}

}
