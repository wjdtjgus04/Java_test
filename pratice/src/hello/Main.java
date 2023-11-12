package hello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요:  ");
        int numStudents = scanner.nextInt();

        Student[] students = new Student[numStudents];

      
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n학생" + (i + 1) + " 정보");
            System.out.print("이름: ");
            String name = scanner.next();
            System.out.print("학번 : ");
            int studentNumber = scanner.nextInt();

            students[i] = new Student(name, studentNumber);
            students[i].inputScores();
        }
        System.out.println();
       
        System.out.println("<성적표>");
        System.out.println();
        for (Student student : students) {
            student.printAverage();
            student.printGrade();
            System.out.println();
        }
        scanner.close();
    }
}
