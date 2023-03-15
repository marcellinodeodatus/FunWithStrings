/*3/15/2020
Name: Deodatus Marcellino
-------------------- Fun With Strings ---------------------------
This program demonstrates the use of several Methods for Strings:
* char charAt(int i)
* int compareToIgnoreCase(String i)
* boolean contains(String s)
* int length()
* String replace(char c, char d)
* String toLowerCase()

The program first prompts the user to enter 2 Strings. Then it will present the user with a menu:
1) Print out which of the two strings comes first, alphabetically. (Or, if they are equal, print this out.)
    In making the comparison, ignore the case of the letters.
2) Print out whether the second String entered is a substring / is contained within the first String entered.
3) Print out the lowercase version of the second String entered.
4) Print out the number of times the first letter in the String appears in the String.
5) Print out the result when you replace all occurrences of 'e' in the second String with 'o'.
6) Quit
* */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String myStr1;
        String myStr2;
        int choice = 0;

        System.out.println("Please enter the first string: ");
        myStr1 = sc.next();

        System.out.println("Please enter the second string: ");
        myStr2 = sc.next();

        while (choice != 6){
            choice = displayMenu();
            switch (choice) {
                case 1:
                    if (myStr1.compareToIgnoreCase(myStr2) < 0){
                        System.out.println(myStr2 + " comes first. ");
                    } else if (myStr1.compareToIgnoreCase(myStr2) > 0){
                        System.out.println(myStr1 + " comes first. ");
                    } else {
                        System.out.println(myStr1 + " is equal with " +myStr2);
                    }
                    break;
                case 2:
                    if (myStr1.contains(myStr2)){
                        System.out.println(myStr2+ " is a substring of " +myStr1);
                    } else {
                        System.out.println(myStr2+ " is a NOT substring of " +myStr1);
                    }
                    break;
                case 3:
                    System.out.println(myStr2.toLowerCase());
                    break;
                case 4:
                    int count = 0;
                    char c = myStr1.toLowerCase().charAt(0);
                    for (int i = 0; i < myStr1.length(); i++){
                        if (myStr1.toLowerCase().charAt(i) == c){
                            count++;
                        }
                    }
                    System.out.println(c + " appears in the first string " +count+" times.");
                     break;
                case 5:
                    System.out.println("Replacing all e's with o's in the second String yields: " +myStr2.replace('e','o'));
                    break;
            }//end switch
        }//end while loop
    }//end driver

    public static int displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Here are your choices: ");
        System.out.println("1) Print out which String comes first.");
        System.out.println("2) Print out whether the second string is a substring of the first.");
        System.out.println("3) Print out the lowercase version of the second string.");
        System.out.println("4) Print out how many times the first letter in the first word appears in the String.");
        System.out.println("5) Print out the result when you replace all e's in the second String with o's");
        System.out.println("6) Quit");
        choice = sc.nextInt();

        return choice;

    }//displayMenu
}