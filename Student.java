import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the number of students and the number of subjects
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        
        // Assuming a fixed number of subjects for simplicity (3 or 4)
        int subjectCount = 4; // Change this number to 3 if needed

        // Arrays to store student names and their marks for each subject
        String[] students = new String[n];
        int[][] marks = new int[n][subjectCount];
        
        // Input student names and marks for each subject
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = sc.next();
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("Enter marks of " + students[i] + " for subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Variables to track the topper, max, and min marks
        int maxMarks = -1;
        int minMarks = 101;
        int topperIndex = -1;

        // Arrays to store the highest marks in each subject and the student who achieved it
        int[] subjectMaxMarks = new int[subjectCount];
        String[] subjectTopper = new String[subjectCount];
        
        // Initialize subjectMaxMarks with minimum possible value
        for (int j = 0; j < subjectCount; j++) {
            subjectMaxMarks[j] = -1;
        }

        // Loop through all students to calculate total marks, max, and min marks
        for (int i = 0; i < n; i++) {
            int totalMarks = 0;
            int studentMax = marks[i][0];
            int studentMin = marks[i][0];

            // Print individual subject marks and calculate total marks, max, and min marks
            System.out.print("Student: " + students[i] + " | Marks: ");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print(marks[i][j] + " ");
                totalMarks += marks[i][j];
                if (marks[i][j] > studentMax) studentMax = marks[i][j];
                if (marks[i][j] < studentMin) studentMin = marks[i][j];

                // Track the highest marks for each subject
                if (marks[i][j] > subjectMaxMarks[j]) {
                    subjectMaxMarks[j] = marks[i][j];
                    subjectTopper[j] = students[i];
                }
            }

            // Calculate the percentage
            double percentage = (totalMarks * 100.0) / (subjectCount * 100);
            System.out.println("| Total Marks: " + totalMarks + " | Max Marks: " + studentMax + " | Min Marks: " + studentMin + " | Percentage: " + percentage + "%");

            // Check if this student has the highest total marks (Topper)
            if (totalMarks > maxMarks) {
                maxMarks = totalMarks;
                topperIndex = i; // Updating the topper
            }
            if (studentMin < minMarks) {
                minMarks = studentMin;
            }
        }

        // Output the topper and the overall max/min marks
        System.out.println("\nTopper: " + students[topperIndex] + " with " + maxMarks + " total marks.");
        System.out.println("Overall Maximum Marks: " + maxMarks);
        System.out.println("Overall Minimum Marks: " + minMarks);

        // Output highest marks and topper for each subject
        for (int j = 0; j < subjectCount; j++) {
            System.out.println("Subject " + (j + 1) + " Highest Marks: " + subjectMaxMarks[j] + " by " + subjectTopper[j]);
        }

        sc.close();
    }
}