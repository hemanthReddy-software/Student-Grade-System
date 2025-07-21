import java.util.Scanner;

public class StudentGradeSystem  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter Marks in 3 Subjects: ");
        int m1 = sc.nextInt();
         int m2 = sc.nextInt(); 
          int m3 = sc.nextInt();
        
        double average = (m1 + m2 + m3); 
        String grade;

        if (average >= 90)
            grade = "A+";
        else if (average >= 75)
            grade = "A";
        else if (average >= 60)
            grade = "B";
        else if (average >= 45)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("\n--- Report ---");
        System.out.println("Name: " + name);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
