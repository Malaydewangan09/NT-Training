public class StudentTest {
    public static void main(String[] args) {
        // Create some Student objects
        Student student1 = new Student(1, "Alice", "Math", 80, 90, 85);
        Student student2 = new Student(2, "Bob", "Science", 75, 85, 95);
        Student student3 = new Student(3, "Charlie", "English", 90, 85, 80);
        Student student4 = new Student(4, "David", "History", 70, 75, 80);
        Student student5 = new Student(5, "Eve", "Computer Science", 85, 90, 95);

        // Print details for each student
        System.out.println(student1.toString());
        System.out.println();
        System.out.println(student2.toString());
        System.out.println();
        System.out.println(student3.toString());
        System.out.println();
        System.out.println(student4.toString());
        System.out.println();
        System.out.println(student5.toString());
        System.out.println();
       }
}
