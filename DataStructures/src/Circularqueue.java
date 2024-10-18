import java.util.Scanner;

public class Circularqueue {
	private int count=0;
	private int r=-1;//rear
	private int f=0;//front
	private int elem;
	private Scanner sc=new Scanner(System.in);
	private int cq[];
	private int size;
	
	
	public Circularqueue(int n)
	{
		cq=new int[n];
		size=cq.length;
		
	}
	public void insert()
	{
		
		if(count==size){
			System.out.println("Insertion not possible");
		}
		else
		{
			System.out.println("Enter the element");
			elem=sc.nextInt();
			r=(r+1)%size;
			cq[r]=elem;
			++count;
		}
	}
	public void delete()
	{
		if(count==0)
		{
			System.out.println("Deletion not possible");
		}
		else
		{
			System.out.println("Element deleted is "+cq[f]);
			cq[f]=0;
			f=(f+1)%size;
			--count;
					
		}
	}
	
	public void display()
	{
		int f1=f;
		if(count==0)
		{
			System.out.println("Display not possible");
		}
		else
		{
			for(int i=1;i<=count;i++)
			{
				System.out.print(cq[f1]+" ");
				f1=(f1+1)%size;
			}
			System.out.println();
		}
	}
	

}
