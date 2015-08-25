package sorting;

import java.util.Scanner;

public class MergeSort {

	public static void merge(int[] input,int startIndex,int mid,int endIndex)
	{
		int[] temp=new int[endIndex-startIndex+1];
		int i=startIndex;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=endIndex)
		{
			if(input[i]<input[j])
			{
				temp[k++]=input[i++];
			}
			else
				temp[k++]=input[j++];
		}
		
		while(i<=mid)
		{
			temp[k++]=input[i++];
		}
		while(j<=endIndex)
		{
			temp[k++]=input[j++];
		}
				
		for(int p=0;p<k;p++)
		{
			input[startIndex++]=temp[p];
		}
			
	}

	public static void mergeSort(int[] input,int startIndex,int endIndex)
	{
		int mid=(startIndex+endIndex)/2;
		if(startIndex<endIndex)
		{

		mergeSort(input, startIndex, mid);
		mergeSort(input,mid+1,endIndex);
		merge(input,startIndex,mid,endIndex);

		}
	}

	public static void display(int [] a)
	{
		System.out.println("Displaying array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static int[] takeArrayInput() 
	{
		System.out.println("enter no. of elements");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int [] a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter"+i+"th elements= ");
			a[i]=s.nextInt();
		}
		return a;
	}

	public static void main(String[] args) 


	{
		int[] input=takeArrayInput();
		mergeSort(input,0,input.length-1);
		display(input);


	}

}
