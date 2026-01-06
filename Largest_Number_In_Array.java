package assignment7;

public class Largest_Number_In_Array {
	static int largestNum(int arr[])
	{
		int max = arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {221,5,9,3,45,56,48,112};
		System.out.println("The Largest Number is : "+largestNum(arr));
	}

}
