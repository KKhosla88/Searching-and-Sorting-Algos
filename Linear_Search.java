package java_Interview_Ques;
import java.util.Scanner;
public class Linear_Search {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int len=arr.length;
		System.out.println("Enter the number: ");
		int k=s.nextInt();
		for(int j=0;j<len;j++)
		{
			if(arr[j]==k)
				System.out.println("Found at"+" "+j);

		}
	}

}
