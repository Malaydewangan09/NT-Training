import java.io.*;
import java.util.*;

public class EmployeeManagement {
    private static final String FILE_NAME = "employees.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayAllEmployees();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void addEmployee() {
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(writer);
             PrintWriter out = new PrintWriter(bw)) {

            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();

            System.out.print("Enter Employee Name: ");
            String name = scanner.next();

            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();

            out.println(id + "," + name + "," + salary);
            System.out.println("Employee added successfully!");

        } catch (IOException e) {
            System.err.println("Error while adding employee: " + e.getMessage());
        }
    }

    private static void displayAllEmployees() {
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] employeeData = line.split(",");

                int id = Integer.parseInt(employeeData[0]);
                String name = employeeData[1];
                double salary = Double.parseDouble(employeeData[2]);

                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}

