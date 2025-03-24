import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Read the student's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Read the student's roll number
        System.out.print("Enter your roll number: ");
        int rollNo = scanner.nextInt();
        
        // Consume the remaining newline
        scanner.nextLine(); 

        // Read the student's department
        System.out.print("Enter your department: ");
        String department = scanner.nextLine();

        // Display the information
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Department: " + department);

        // Close the scanner
        scanner.close();
    }
}

