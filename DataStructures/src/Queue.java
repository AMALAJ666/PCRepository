import java.util.Scanner;

public class Queue {
	private int r=-1;
	private int f=0;
	private int elem;
	private int q[];
	private int size;
	
	private Scanner sc=new Scanner(System.in);
	
	public Queue(int n)
	{
		q=new int[n];
		size=q.length;
	}
	public void insert()
	{
		if(r==size-1)
		{
			System.out.println("Insertion not possible");
		}
		else
		{
		System.out.println("Enter the element");
		elem=sc.nextInt();
		++r;
		q[r]=elem;
		}
	}
	public void delete()
	{
		if(r==-1||f>r)
		{
			System.out.println("deletion not possible");
		}
		else
		{
			System.out.println("The deleted element is "+q[f]);
			q[f]=0;
			++f;
			
		}
		
	}

	public void display()
	{
		if(r==-1||f>r)
		{
			System.out.println("display not possible");
		}
		else
		{
			for(int i=f;i<=r;i++)
			{
				System.out.print(q[i]+" ");
			}
			System.out.println();
		}
	}

}
