import java.util.Scanner;

public class CircularQueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of circular queue");
		int n=sc.nextInt();
		Circularqueue cq=new Circularqueue(n);
		while(true)
		{
			System.out.println("Press 1-->Inserting");
			System.out.println("Press 2-->Deleting");
			System.out.println("Press 3-->Displaying");
			System.out.println("Press other to exit");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:cq.insert();
			break;
			case 2:cq.delete();
			break;
			case 3:cq.display();
			break;
			default:System.exit(0);
			}
		}

	}

}
