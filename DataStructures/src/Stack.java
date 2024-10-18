import java.util.Scanner;

public class Stack {
	private int s[];
	private int size;
	private int elem;
	private int top=-1;
	private Scanner sc=new Scanner(System.in);
	
	public Stack(int n)
	{
		s=new int[n];
		size=s.length-1;
		
	}
	public void push()
	{
		if(top==size)
		{
			System.out.println("Push or insertion not possible");
		}
		else
		{
		System.out.println("Enter the element");
		elem=sc.nextInt();
		++top;
		s[top]=elem;
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Pop or deletion not possible");
		}
		else
		{
		System.out.println("Deleted elemnt is "+s[top]);
		s[top]=0;
		--top;
		}
	}
	public void display()
	{
		if(top==-1)
		{
			System.out.println("Display not possible");
		}
		else
		{
		for(int i=top;i>=0;i--)
		{
			System.out.println(s[i]);
		}
		}
	}
	

}
