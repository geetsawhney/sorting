import java.util.Scanner;


public class InsertionSort {
	
	public static int[] takeArrayInput()
	{
			
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number of elements");
			int n=s.nextInt();
			int[] input1=new int [n];
			for(int i=0;i<n;i++)
			{
				input1[i]=s.nextInt();
			}
			return input1;
			
			
	}
	
	public static void display(int [] a)
	{
		System.out.print("Displaying array\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static int[] insertionSort(int[]a)
	{
		int temp,j;
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];
			j=i-1;
			while(j>-1 && a[j]>temp )
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		return a;
	}

	public static void main(String[] args) {

		System.out.println("enter array= ");
		int[] input=takeArrayInput();
		input=insertionSort(input);
		display(input);
	}

}
