package sorting;

import java.util.ArrayList;

public class RadixSort {

	public static void radixSort_1(int[] input)
	{

		int max=input[0];

		for(int num: input)
		{
			if(num>max)
				max=num;
		}

		ArrayList<ArrayList<Integer>> bucket=new ArrayList<ArrayList<Integer>>();

		for(int i=0;i<10;i++)
		{
			bucket.add(new ArrayList<Integer>());
		}

		int p=0;
		int exp=1;
		int index;
		while((max/exp)>0)
		{
			for(int i=0;i<input.length;i++)
			{
				index=(input[i]/exp)%10;
				bucket.get(index).add(input[i]);
			}

			p=0;
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<bucket.get(i).size();j++)
				{
					input[p++]=bucket.get(i).get(j);
				}

				bucket.set(i, new ArrayList<Integer>());
			
			}
			exp*=10;
		}
	}

	public static int[] radixSort_2(int input[])
	{
	
		
		int max=Integer.MIN_VALUE;
		int exp=1;
		
		
		for(int i=0;i<input.length;i++)
		{
			if(max<input[i])
				max=input[i];
		}
		
		while((max/exp)>0)
		{
			int[] bucket=new int[10];
			int[] temp=new int[input.length];
			
			for(int i=0;i<input.length;i++)
			{
				bucket[(input[i]/exp)%10]+=1;
			}
			
			for(int i=1;i<bucket.length;i++)
			{
				bucket[i]=bucket[i]+bucket[i-1];
			}
		
			for(int i=input.length-1;i>=0;i--)
			{
				
				temp[--bucket[(input[i]/exp)%10]]=input[i];
				
			}
			
			input=temp;
			exp*=10;
		}
		return input;
		
	}

	public static void display(int[] a)
	{
		System.out.println();

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}


	public static void main(String[] args) {


		int input[]={10,56,2,488,1,6,3,5,87,1,3,6,5,64,3,6,9,6,686,3,1,5,5,595,65,1255,56,4,65,468,456,4,6,489,23,63,365,4};
	
		input=radixSort_2(input);
		display(input);

	}
}
