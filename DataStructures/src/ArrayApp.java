import java.util.Scanner;

public class ArrayApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n=sc.nextInt();
		Array a=new Array(n);
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
			case 1:a.insert();
			break;
			case 2:a.delete();
			break;
			case 3:a.display();
			break;
			default:System.exit(0);
			}
		}
	}

}
