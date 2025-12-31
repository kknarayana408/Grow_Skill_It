package assignment6;

public class Replace_Number_at_Odd_Position_with_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 987516;
		int count = 0;
		int output = 0;
		while(num>0)
		{
			int lastDigit = num%10;
			count++;
			if(count==2)
				output= lastDigit*10+output;
			else if(count==4)
				output= lastDigit*1000+output;
			else if(count==6)
				output= lastDigit*100000+output;
			num=num/10;
		}
		
		System.out.println(output);
	}

}
