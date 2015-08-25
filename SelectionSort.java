package sorting;
import java.util.Scanner;


public class SelectionSort {


	public static int[] selectionSort(int[] input)
	{
		int min,minIndex;
		for(int i=0;i<input.length-1;i++)
		{
			min=input[i];
			minIndex=i;
			for(int j=i+1;j<input.length;j++)
			{
				if(input[j]<min)
				{
					min=input[j];
					minIndex=j;
				}
			}
			input[minIndex]=input[i];
			input[i]=min;
		}
		return input;

	}

	public static int[] takeArrayInput()
	{

		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=s.nextInt();
		int[] input=new int [n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the"+i+"th element");
			input[i]=s.nextInt();
		}
		return input;


	}
	public static void display(int [] a)
	{
		System.out.println("Displaying array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args)
	{

		int[] input2=takeArrayInput();
		input2=selectionSort(input2);
		display(input2);

	}

}