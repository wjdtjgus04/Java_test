package hello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("�л� ���� �Է��ϼ���:  ");
        int numStudents = scanner.nextInt();

        Student[] students = new Student[numStudents];

      
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n�л�" + (i + 1) + " ����");
            System.out.print("�̸�: ");
            String name = scanner.next();
            System.out.print("�й� : ");
            int studentNumber = scanner.nextInt();

            students[i] = new Student(name, studentNumber);
            students[i].inputScores();
        }
        System.out.println();
       
        System.out.println("<����ǥ>");
        System.out.println();
        for (Student student : students) {
            student.printAverage();
            student.printGrade();
            System.out.println();
        }
        scanner.close();
    }
}
