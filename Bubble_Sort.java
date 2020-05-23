package java_Interview_Ques;

import java.util.Arrays;

public class Bubble_Sort 
{
	void bubble_sort(int arr[])
	{
		int size=arr.length;
		for(int i=0;i<size-1;i++)
		{
			int flag=0;
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
	}

	public static void main(String[] args) 
	{
	
		int []data= {-2,45,9,0,-3,-9,70};
		Bubble_Sort bs=new Bubble_Sort ();
		bs.bubble_sort(data);
		System.out.println("Sorted Array: "+Arrays.toString(data));
	}

}
