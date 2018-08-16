import java.util.*;

public class Cinema {
	public static void main(String[] args) {
		Standard standard = new Standard();
		OAP oap = new OAP();
		Child child = new Child();
		Student student = new Student();
		
		Scanner select = new Scanner(System.in);

		System.out.println("----------------------------------");
		System.out.println("QA Cinemas Ticket Booking System");
		System.out.println("---------------------------------\n");

		System.out.println("Enter 1 to book a screening on Monday");
		System.out.println("Enter 2 to book a screening on Tuesday");
		System.out.println("Enter 3 to book a screening on Wednesday");
		System.out.println("Enter 4 to book a screening on Thursday");
		System.out.println("Enter 5 to book a screening on Friday");
		System.out.println("Enter 6 to book a screening on Saturday");
		System.out.println("Enter 7 to book a screening on Sunday");
		int day = select.nextInt();

		int totalCost = 0;
			
		do {
			System.out.println("\nEnter 1 to add a Standard ticket");
			System.out.println("Enter 2 to add an OAP ticket");
			System.out.println("Enter 3 to add a Child ticket");
			System.out.println("Enter 4 to add a Student ticket");
			System.out.println("Enter 5 to checkout");
				
			int option = select.nextInt();
			if (option == 1) totalCost+=(day == 3) ? standard.getPrice()-2 : standard.getPrice();
			else if (option == 2) totalCost+=(day == 3) ? oap.getPrice()-2 : oap.getPrice();
			else if (option == 3) totalCost+=(day == 3) ? child.getPrice()-2 : child.getPrice();
			else if (option == 4) totalCost+=(day == 3) ? student.getPrice()-2 : student.getPrice();
			else if (option == 5) break;
		} while(true);

		System.out.println("The total cost of tickets for this movie is £" + totalCost);
	}
}