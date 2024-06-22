package com.codsoftintern;
import java.util.Scanner;
public class StudentGradeCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //taking input from user for Number of Subjects
            System.out.print("Enter the number of subjects: ");
            int TotalSubjects = sc.nextInt();

            int totalMarks = 0;
            for (int i = 1; i <= TotalSubjects; i++) {
                System.out.print("Enter marks obtained in subject " + i + ": ");
                int marksObtained = sc.nextInt();
                totalMarks += marksObtained;
            }

            double averagePercentage = (double) totalMarks / TotalSubjects;

            char grade;
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else if (averagePercentage >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage);
            System.out.println("Grade: " + grade);

            sc.close();
        }
    }

