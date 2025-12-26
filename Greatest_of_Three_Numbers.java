package assignment4;

public class Greatest_of_Three_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=110;
		int num2=126;
		int num3=24;
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(num1+" is greatest of three numbers");
			}
			else
			{
				System.out.println(num3+" is greatest of three numbers");
			}
		}
		else if(num2>num3)
		{
			System.out.println(num2+" is greatest of three numbers");
		}
		else
		{
			System.out.println(num3+" is greatest of three numbers");
		}

	}

}
