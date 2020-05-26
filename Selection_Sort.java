package java_Interview_Ques;

import java.util.Arrays;

public class Selection_Sort 
{
	void selection(int a[])
	{
		int n=a.length;
		int min;
		for(int i=0;i<n;i++)
		{
			min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}

	public static void main(String[] args)
	{
		int data[]= {4,7,9,23,14,73,2,8,6};
		Selection_Sort ss=new Selection_Sort();
		ss.selection(data);
		System.out.print("Sorted Array :"+Arrays.toString(data));
	}

}
