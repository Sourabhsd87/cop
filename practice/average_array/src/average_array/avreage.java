package average_array;

import java.util.Scanner;

public class avreage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you want to calculate average :- ");
		int size = sc.nextInt();
		int sum=0;
		int arr[] = new int[size];
		System.out.println("Enter numbers :-");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.print("Average = "+((float)sum/size));
	}

}
