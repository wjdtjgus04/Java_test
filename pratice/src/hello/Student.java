package hello;

import java.util.Scanner;

class Student {
    String name;
    int studentNumber;
    String[] sub = {"국어", "수학","영어"};
    int[] scores = new int[3];
    double average;


    public Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }


    public void inputScores() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.print("과목별 점수 " + sub[i] + ": ");
            scores[i] = scanner.nextInt();
        }

        calculateAverage();
    }


    private void calculateAverage() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        average = (double) sum / scores.length;
    }

 
    public void printAverage() {
    	 System.out.println("이름:  " + name + " (학번: " + studentNumber + ")");
        System.out.println("평균점수: " + average);
    }

    
    public void printGrade() {
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("등급 : " + grade);
    }
}


