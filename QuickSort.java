
public class QuickSort {


	public static int partition(int[] input,int beginIndex,int endIndex)
	{
		int pivot=input[beginIndex];
		int left=beginIndex;
		int right=endIndex;

		while(left<right)
		{
			while(input[left]<=pivot && left<endIndex)
				left++;
			
			while(input[right]>pivot)
				right--;

			if(left<right)
			{
				int temp=input[right];
				input[right]=input[left];
				input[left]=temp;
			}
		}

		input[beginIndex]=input[right];
		input[right]=pivot;
		return right;
	}

	public static void quickSort(int [] input, int beginIndex,int endIndex)
	{

		if(beginIndex>=endIndex)
			return;

		int pivotIndex=partition(input,beginIndex,endIndex);
		quickSort(input, beginIndex, pivotIndex-1);
		quickSort(input, pivotIndex+1, endIndex);
	}

	public static void display(int [] a)
	{
		System.out.println("Displaying array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		double p=Math.random();
		int[] input={9,1,2,9,4,5,6,7};
		quickSort(input, 0, input.length-1);
		display(input);
		
		System.out.println("\n\n"+p);
	}

}
