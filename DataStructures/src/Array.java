import java.util.Scanner;

public class Array {
	
	private int arr[];
	

	private Scanner sc=new Scanner(System.in);
	public Array(int n)
	{
		arr=new int[n];
		
		
	}
	public void insert()
	{
		System.out.println("Enter position where element should be stored");
		int pos=sc.nextInt();
		System.out.println("Enter the element");
		int elem=sc.nextInt();
		arr[pos]=elem;
	}
	public void delete()
	{
		System.out.println("Enter position to delete element");
		int pos=sc.nextInt();
		System.out.println("Deleted element is "+arr[pos]);
		arr[pos]=0;
		
	}
	public void display()
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" "); 
		}
		System.out.println();
	}

}
