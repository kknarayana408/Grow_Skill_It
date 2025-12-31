package assignment6;

public class Add_Trailing_Zeros_Based_on_Digit_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 777;
		int orginal_num=num;
		int count = 0;
		while(num>0)
		{
			num=num/10;
			count++;
			System.out.println(count);
		}
		if(count==1)
			System.out.println("Output : "+orginal_num*10);
		else if(count==2)
			System.out.println("Output : "+orginal_num*100);
		else
			System.out.println("Output : "+orginal_num);
		

	}

}

