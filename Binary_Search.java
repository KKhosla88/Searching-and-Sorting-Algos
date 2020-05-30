package java_Interview_Ques;

public class Binary_Search {

	public static void main(String[] args) 
	{
		int arr[]= {1,3,6,9,12,15,17,23,28,31,34,44,46,47};
		int find=9;
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(arr[mid]==find)
			{
				System.out.println("Element is at "+mid+" position");
				break;
			}
			else if(arr[mid]<find)
			{
				low=mid+1;
			}
			else
				high=mid-1;
			mid=(low+high)/2;
		}
		if(low>high)
		{
			System.out.println("Element not found");
		}
	}

}
