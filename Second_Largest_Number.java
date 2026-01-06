package assignment7;

public class Second_Largest_Number {

	static int SecLargestNum(int arr[])
	{
		int max = arr[0];
		int S_max = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<max && arr[i]>S_max)
			{
				S_max=arr[i];
			}
		}
		return S_max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {111,5,9,113,45,56,48,122};
		System.out.println("The Second Largest Number is : "+SecLargestNum(arr));
	}

}


