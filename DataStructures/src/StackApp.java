import java.util.Scanner;
public class StackApp {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of the array");
			int n=sc.nextInt();
			Stack stack=new Stack(n);
			while(true)
			{
				System.out.println("Press 1 ----Insert or push");
				System.out.println("Press 2 ----Delete or pop");
				System.out.println("Press 3 ----Display");
				System.out.println("Press other key to exit");
				System.out.println("Enter your choice");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:stack.push();
				break;
				case 2:stack.pop();
				break;
				case 3:stack.display();
				break;
				default:System.exit(0);
				}
			}
		}

	}

