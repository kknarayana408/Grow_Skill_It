package assignment5;

public class Print_Factors_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num = 12;
		short temp = num;
		for(int i = 1; i<=12;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
