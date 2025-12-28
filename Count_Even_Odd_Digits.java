package assignment5;

public class Count_Even_Odd_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 24879;
		int temp = num;
		short even_count = 0;
		short odd_count = 0;
		while(num%10!=0)
		{
			if(num%2==0)
				even_count++;
			else
				odd_count++;
			num=num/10;
		}
		System.out.println("Number of ODD numbers in "+temp+" is : "+odd_count);
		System.out.println("Number of EVEN numbers in "+temp+" is : "+even_count);


	}

}
