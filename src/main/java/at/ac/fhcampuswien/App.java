package at.ac.fhcampuswien;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        Scanner sc = new Scanner(System.in);

        int counter = 1;
        double temp = 0;

        System.out.println("Number " + counter++ + ": ");
        double number = sc.nextDouble();

        temp = number;
        if (number <= 0) {
            System.out.println("No number entered.");
        }

        while (number > 0) {
            System.out.println("Number " + counter++ + ": ");
            number = sc.nextDouble();

            if (number > temp) {
                temp = number;
            }
            if (number == 0 || number < 0) {
                System.out.println("The largest number is " + String.format("%.2f", temp));
                break;
            }
        }

    }


    //todo Task 2
    public void stairs() {
        // input your solution here

    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here

    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
    }

    //todo Task 5
    public void marks() {
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int number = 1;

        double mark = 1;
        int countmarks = 0;
        int countminusmarks = 0;

        double sum = 0;
        double average;

        while (mark > 0) {
            System.out.print("Mark " + number + ": ");
            number++;

            mark = scan.nextInt();

            if ((number == 2) && (mark == 0)) {
                System.out.println("Average: 0,00");
                System.out.println("Negative marks: 0");
            } else if ((mark > 5) && (mark != 0)) {
                System.out.println("Invalid mark!");
                number--;
            } else if ((mark > 0) && (mark < 6)) {
                sum = sum + mark;
                countmarks++;

                if (mark == 5) {
                    countminusmarks++;
                }
            } else if (mark == 0) {
                average = sum / (countmarks);
                System.out.println("Average: " + String.format("%.2f", average));
                System.out.println("Negative marks: " + countminusmarks);
            }
        }
    }

    //todo Task 6
    public void happyNumbers() {
        // input your solution here
        Scanner scan = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int sum;

        System.out.print("n: ");
        int numberu = scan.nextInt();

        while (numberu > 0) {
            if (numberu != 1 && numberu != 4) {
                number1 = (numberu / 100) % 10;
                number2 = (numberu / 10) % 10;
                number3 = numberu % 10;

                sum = (int) (Math.pow(number1, 2) + Math.pow(number2, 2) + Math.pow(number3, 2));

                numberu = sum;

            } else if (numberu == 1) {
                System.out.println("Happy number!");
                break;

            } else if (numberu == 4) {
                System.out.println("Sad number!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}