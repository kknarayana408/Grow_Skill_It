package assignment7;

public class Make_Largest_Element_As_Zero {
	static void fun(int arr[])
	{
		int max = arr[0],j=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				j=i;		
			}
		}
		arr[j]=0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {22,5,9,3,45,56,48,112};
		fun(arr);
		for(int i=0;i<=arr.length-1;i++)
			System.out.print(arr[i]+" ");
	}
}
