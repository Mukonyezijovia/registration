package registrationsystem;
import java.util.Scanner;
public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int numUsers;
		String[]usernames=new String[3];
		String[]passwords=new String[3];
		String[]emails=new String[3];
		int[]ages=new int[3];
		
		for(int i=0;i<3;i++) {System.out.println("\nUser"+(i+1)+"Registration");
		System.out.println("Enter username:");
		usernames[i]=scanner.nextLine();
		System.out.println("Enter password(min 8 chars):");
		passwords[i]=scanner.nextLine();
		if (passwords[i].length()<8) {
			System.out.println("Passwordmust be at least 8 characters.");
			i--;//Repeat password input continue;
		}
		System.out.println("Enter email:");
		emails[i]=scanner.nextLine();
		if(!emails[i].contains("@")) {
			System.out.println("Invalid email format.");
			i--;//Repeat email input continue;
		}
		System.out.print("Enter age(20-50):");
		ages[i]=scanner.nextInt();
		scanner.nextLine();//Consume newline left-over
		if(ages[i]<20||ages[i]>50) {
			System.out.println("Age must be between 20 and 50.");
			i--;//Repeat age input continue;
		}
				
		}
			System.out.println("\nRegistration Summery:");
			for(int i=0; i<3;i++) {
				System.out.println("User"+(i+1)+":");
				System.out.println("Username:"+ usernames[i]);
				System.out.println("Email:"+ emails[i]);
				System.out.println("Age:"+ ages[i]);
				System.out.println();
			}

	}

}
