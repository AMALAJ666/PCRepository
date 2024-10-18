
import java.util.Scanner;
public class QueueApp {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter size of the array");
				int n=sc.nextInt();
				Queue q=new Queue(n);
				while(true)
				{
					System.out.println("Press 1 ----Insert");
					System.out.println("Press 2 ----Delete");
					System.out.println("Press 3 ----Display");
					System.out.println("Press other key to exit");
					System.out.println("Enter your choice");
					int ch=sc.nextInt();
					switch(ch)
					{
					case 1:q.insert();
					break;
					case 2:q.delete();
					break;
					case 3:q.display();
					break;
					default:System.exit(0);
					}
				}
			}

		}



