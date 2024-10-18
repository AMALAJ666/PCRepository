

import java.util.Scanner;

public class SinglyLinkedListApp {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		SinglyLinkedList sll=new SinglyLinkedList();
		while(true)
		{
			System.out.println("Press 1-->Insert at rear");
			System.out.println("Press 2-->Delete at rear");
			System.out.println("Press 3-->Insert at front");
			System.out.println("Press 4-->Delete at front");
			System.out.println("Press 5-->Display");
			System.out.println("Press other to exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:sll.insertrear();
			break;
			case 2:sll.deleterear();
			break;
			case 3:sll.insertfront();
			break;
			case 4:sll.deletefront();
			break;
			case 5:sll.display();
			break;
			default:System.exit(0);
			
			}
		}
	}

}
