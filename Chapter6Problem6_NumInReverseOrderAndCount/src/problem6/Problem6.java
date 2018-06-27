/*
* IT--2650 Java Programming, Spring 2017
* Instructor: Martin P. Walsh
* Student Name: Zachary Vehar
* Homework Assignment: Chapter 6, Problem 6
* Purpose of Assignment: To read a keyboard number and input into an array and count the occurrences of each number.
*
*/
package problem6;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        
            
     System.out.println("IT--2650 Java Programming");
     System.out.println("Student Name: Zachary Vehar");
     System.out.println("Homework Assignment: Chapter 6, Problem 6");
     System.out.println("__________________________________________");
     System.out.println("");   
        
       
        
         Ch6 example1 = new Ch6();
         Scanner keyboard = new Scanner(System.in);
         System.out.println("How many numbers to enter? (At most 50): ");
         int numTotal = keyboard.nextInt();
         example1.setNumTotal(numTotal);
         int[] numbers = new int[numTotal];
         System.out.println("Enter each of the " + numTotal + " numbers. Please put a space between each number: ");

    for (int i = 0; i < numbers.length; i++)
    
       numbers[i] = keyboard.nextInt();
       Ch6.sort(numbers, numbers.length);
   
        
  int counter = 1;
  System.out.println("Num" + "\t" + "Count");
    for (int y = 0; y < numbers.length-1; y++) {
        if (numbers[y] == numbers[y + 1]) {
            counter++;
        }
        else {
            System.out.print(numbers[y]);
            System.out.print("\t");
            System.out.print(counter);
            counter = 1;

        System.out.println();
    }   
    }
System.out.print(numbers[numTotal-1]);
System.out.print("\t");
System.out.print(counter);
System.out.println();
    }}