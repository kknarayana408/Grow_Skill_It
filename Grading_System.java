package assignment4;

public class Grading_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short marks = 100;
		if(marks<=100)
		{
			if(marks>=0)
			{
				if(marks>=90)
				{
					System.out.println(" you got \"A\" grade");			
				}
				else if(marks>=75)
				{
					System.out.println(" you got \"B\" grade");	
				}
				else if(marks>=50)
				{
					System.out.println(" you got \"C\" grade");	
				}
				else 
				{
					System.out.println(" you got failed");	
				}
				
			}
			else
			{
				System.out.println(" Please provide valid marks");	
			}
		}
		else
		{
			System.out.println(" Please provide valid marks below 100");	
		}
	}
}

