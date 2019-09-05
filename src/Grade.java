import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int score;
        String grade = " ";
        String grd = " ";
        Scanner key = new Scanner(System.in);
        System.out.println(" Please enter student's score: ");
        score = key.nextInt();
        if (score > 100) {
            grade = "Error: score out of range ; enter the right score.";}
        else if (score >= 97) {
            grade = "A+";
        } else if (score >= 94) {
            grade = "A";
        } else if (score >= 90) {
            grade = "A-";
        } else if (score >= 87) {
            grade = "B+";
        } else if (score >= 84) {
            grade = "B";
        } else if (score >= 80) {
            grade = "B-";
        } else if (score >= 77) {
            grade = "C+";
        } else if (score >= 74) {
            grade = "C";
        } else if (score >= 70) {
            grade = "C-";
        } else if (score >= 60) {
            grade = "D";
        } else if (score < 60) {
            grade = "Go back to school if you get below 60";}
     else {
            System.out.println(" Error: Enter the right score: ");
        }
        {
            System.out.println("Your score is: " + score);
        }
        {System.out.println("Your score is: " + grade);}
        {
            System.out.println("Do you want to enter another score (Y/N)?");
                  }
        grd = key.next();
        while (grd.equalsIgnoreCase("Y")) {
            System.out.println(" Please enter student's score: ");
            score = key.nextInt();
            if (score > 100) {
                grade = "Error: score out of range ; enter the right score.";}
            else if (score >= 97) {
                grade = "A+";
            } else if (score >= 94) {
                grade = "A";
            } else if (score >= 90) {
                grade = "A-";
            } else if (score >= 87) {
                grade = "B+";
            } else if (score >= 84) {
                grade = "B";
            } else if (score >= 80) {
                grade = "B-";
            } else if (score >= 77) {
                grade = "C+";
            } else if (score >= 74) {
                grade = "C";
            } else if (score >= 70) {
                grade = "C-";
            } else if (score >= 60) {
                grade = "D";
            } else if (score < 60) {
                grade = "Go back to school if you get below 60";}
            else {
                System.out.println(" Error: Enter the right score: ");
            }
            {
                System.out.println("Your score is: " + score);
            }
            {System.out.println("Your score is: " + grade);}
            {
                System.out.println("Your score is: " + score);
            }
            {System.out.println("Your score is: " + grade);}
                }
    }
}



