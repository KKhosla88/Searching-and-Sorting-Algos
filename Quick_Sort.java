package java_Interview_Ques;

public class Quick_Sort {

	public static void main(String[] args) 
	{
		int arr[]= {18,8,4,16,3,7,11,15,9,13};
		int len=arr.length;
		 Quick_Sort qs=new   Quick_Sort();
		 qs. quickSortRecurssion(arr,0,len-1);
		 qs.printArray(arr);
	}
	int Qsort(int arr[],int low,int high)
	{
		int pivot=arr[(low+high)/2];
		while(arr[low]<=high)
		{
			low++;
		}
		while(arr[high]>pivot)
		{
			high--;
		}
		if(low<=high) 
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		return low;
	}
	void quickSortRecurssion(int arr[],int low,int high)
	{
		int pi=Qsort(arr,low,high);
		if(low<pi-1)
		{
			 quickSortRecurssion(arr,low,pi-1);
		}
		if(pi<high)
		{
			 quickSortRecurssion(arr,pi,high);
		}
	}
	void printArray(int arr[]) {
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}

