package ex21.base;
/*
 *  UCF COP3330 Summer 2021 Exercise 21 Solution
 *  Copyright 2021 Justin Cepeda
 */

/*
Exercise 21 - Numbers to Names
Many programs display information to the end user in one form but use a different form inside the program. For example,
you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that color or an
internal value because you may need to represent the textual description in another language for Spanish-speaking
visitors.

Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the
corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display an
appropriate error message.

Example Output
Please enter the number of the month: 3
The name of the month is March.
Constraints
Use a switch or case statement for this program.
Use a single output statement for this program.
Challenges
Use a map or dictionary to remove the switch statement from the program.
Support multiple languages. Prompt for the language at the beginning of the program.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number of the month: ");
        int number = in.nextInt();

        String month = null;

        switch(number) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                break;
        }

        System.out.printf("The name of the month is %s", month);

    }
}
