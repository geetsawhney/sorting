package sorting;
import java.util.Scanner;


public class BubbleSort {
	

	public static int[] takeArrayInput()
	{
			
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number of elements");
			int n=s.nextInt();
			int[] input1=new int [n];
			for(int i=0;i<n;i++)
			{
				System.out.println("enter the"+i+"th element");
				input1[i]=s.nextInt();
			}
			return input1;
			
			
	}

	public static int[] bubbleSort(int[] input)
	{
		for(int i= 0;i<input.length-1;i++)
		{
			for(int j=0;j<input.length-1;j++)
			{
				if(input[j]>input[j+1])
				{
					int temp=input[j+1];
					input[j+1]=input[j];
					input[j]=temp;
					
				}
			}
		}
		return input;
	}



	
public static void display(int [] a)
{
	System.out.print("Displaying array");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}



public static void main(String[] args) {
		
		int[] input2=takeArrayInput();
		input2=bubbleSort(input2);
		display(input2);
		
		

		
		
	}

}
