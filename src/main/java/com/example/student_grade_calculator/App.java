package com.example.student_grade_calculator;
import java.util.Scanner;

public class App {

    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public static double calculateAverage(int[] marks) {
        return calculateTotal(marks) / 5.0;
    }

    public static String calculateGrade(double average) {
        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Subject " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter 0 to 100.");
                sc.close();
                return;
            }
        }

        int total = calculateTotal(marks);
        double average = calculateAverage(marks);
        String grade = calculateGrade(average);

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
