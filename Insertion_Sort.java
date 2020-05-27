package java_Interview_Ques;

import java.util.Arrays;

public class Insertion_Sort {
	void insertion(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
	}

	public static void main(String[] args) 
	{
		int data[]= {8,4,23,55,9,12,2,46,77};
		Insertion_Sort in=new Insertion_Sort();
		in.insertion(data);
		System.out.println("Sorted Array: "+Arrays.toString(data));
	}
	
}
