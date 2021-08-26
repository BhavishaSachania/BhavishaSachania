import java.io.*;
import java.util.*;

public class Client {

	public static void main(String[] args) {
		welcomeScreen();
		try {
			menuDriven();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public static void welcomeScreen() {
		System.out.println("Application Name : LockedMe.com \n");
		System.out.println("Developer Details: Bhavisha Sachania \n ");
	}

	public static void menuDriven() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Operation obj = new Operation();
		int option;
		do {
		System.out.println("Enter your choice: \n");
		System.out.println("\t1. filenames in ascending order \n");
		System.out.println("\t2. operation menu \n");
		System.out.println("\t3. Exit \n");
		
		option=sc.nextInt();
		switch(option) {
		case 1:
			obj.showAllFiles();
			break;
		case 2:
			int ch;
		do {
			System.out.println("Enter your choice:");
			System.out.println("\t1. Add a file and its content to a directory");
			System.out.println("\t2. Delete a file from a directory");
			System.out.println("\t3. Searching a file and showing its content");
			System.out.println("\t4. Exit");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				obj.addFile();
				break;
			case 2:
				obj.deleteFile();
				break;
			case 3:
				obj.searchFile();
				break;
			case 4:
				System.out.println("Exite");
				System.out.println("---------------------------------\n");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Exiting from the application...");
			break;
		default:
			System.out.println("Invalid choice");
		}
		
	
		}while(option!=3);
		
	}
}
