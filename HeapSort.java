
public class HeapSort {

	public static void heapSort(int [] input)
	{

		for(int i=1;i<input.length;i++)
		{
			int current=i;
			int parent=(current-1)/2;

			if(input[parent]<input[current])
			{				
				while(current>0)
				{
					if(input[parent]<input[current])
					{
						swap(input, parent, current);
					}
					else{
						break;
					}
					current=parent;
					parent=(parent-1)/2;
				}
			}
		}

		int end=input.length-1;

		for(int i=0;i<input.length;i++)
		{
			swap(input, 0, end);
			end--;

			int parentNode=0;
			int leftChild=(2*parentNode)+1;
			int rightChild=leftChild+1;

			while(leftChild<=end)
			{
				int indexToBeSwapped=-1;

				if(input[leftChild]>input[parentNode])
				{
					indexToBeSwapped=leftChild;
				}
				if(rightChild<=end)
				{
					if(input[rightChild]>input[parentNode] && input[leftChild]<input[rightChild])
					{
						indexToBeSwapped=rightChild;
					}
				}
				if(indexToBeSwapped!=-1)
				{
					swap(input, parentNode, indexToBeSwapped);
				}
				else
				{
					break;
				}

				parentNode=indexToBeSwapped;
				leftChild=(2*parentNode)+1;
				rightChild=leftChild+1;
			}
		}

	}

	public static void swap(int[] input, int parent, int current) {
		int temp=input[parent];
		input[parent]=input[current];
		input[current]=temp;
	}

	public static void main(String[] args) {

		int[] input={10,11,8,1,3,12,6};
		heapSort(input);
		SelectionSort.display(input);

	}

}
