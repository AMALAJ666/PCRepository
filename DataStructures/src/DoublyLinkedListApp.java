

import java.util.Scanner;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		

				Scanner sc=new Scanner(System.in);
				DoublyLinkedList dll=new DoublyLinkedList();
				while(true)
				{
					System.out.println("Press 1-->Insert at rear");
					System.out.println("Press 2-->Delete at rear");
					System.out.println("Press 3-->Insert at front");
					System.out.println("Press 4-->Delete at front");
					System.out.println("Press 5-->Display from front");
					System.out.println("Press 6-->Display from rear");
					System.out.println("Press other to exit");
					int ch=sc.nextInt();
					switch(ch)
					{
					case 1:dll.insertrear();
					break;
					case 2:dll.deleterear();
					break;
					case 3:dll.insertfront();
					break;
					case 4:dll.deletefront();
					break;
					case 5:dll.displayforward();
					break;
					case 6:dll.displayreverse();
					break;
					default:System.exit(0);
					
					}
				}
			}

		

	}


