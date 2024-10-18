

import java.util.Scanner;

public class SinglyLinkedList {
	class Node
	{
		int data;
		Node link;
	}
	private Node first;
	private Scanner sc=new Scanner(System.in);
	
	
	public void insertrear()
	{
		Node temp;
		System.out.println("Enter the element to be inserted at rear");
		int elem=sc.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.link=null;
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			temp=first;
			while(temp.link!=null)
			{
				temp=temp.link;
			}
			temp.link=newnode;
			
		}
	}
	
	public void deleterear()
	{
		Node temp;
		if(first==null)
		{
			System.out.println("Deletion not possible");
		}
		else if(first.link==null)
		{
			System.out.println("Element deleted is "+first.data);
			first=null;
			
		}
		else
		{
			temp=first;
			while(temp.link.link!=null)
			{
				temp=temp.link;
			}
			System.out.println("Element deleted is "+temp.link.data);
			temp.link=null;
		}
		
	}
	
	public void insertfront()
	{
		Node temp;
		Node newnode=new Node();
		System.out.println("Enter the element to be inserted at front");
		int elem=sc.nextInt();
		newnode.data=elem;
		newnode.link=null;
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			newnode.link=first;
			first=newnode;
		}
	}
	
	public void deletefront()
	{
		if(first==null)
		{
			System.out.println("Deletion not possible");
		}
		else if(first.link==null)
		{
			System.out.println("Element deleted is "+first.data);
			first=null;
		}
		else
		{
			System.out.println("Element deleted is "+first.data);
			first=first.link;
		}
	}
	
	public void display()
	{
		if(first==null)
		{
			System.out.println("Display not possible");
		}
		else if(first.link==null)
		{
			System.out.println(first.data);
		}
		else
		{
			Node temp;
			temp=first;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.link;
			}
			System.out.println();
		}
		
	}
	
}
