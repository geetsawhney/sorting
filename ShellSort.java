public class ShellSort {

	public static void shellSort(int input[])
	{
		int gap=(input.length)/2;
		
		while(gap>0)
		{
			for(int i=0;i<(input.length-gap);i++)
			{
				int j=i+gap;
				int min=input[j];
				
				while((j-gap)>=0 && min<input[j-gap])
				{
					input[j]=input[j-gap];
					j-=gap;
				}
				input[j]=min;
			}
			gap/=2;
		}
	}
	
	public static void main(String[] args) {

		int input[]={10,9,8,7,6,5,4,3,2,1};
		shellSort(input);
		SelectionSort.display(input);
		
	}
}