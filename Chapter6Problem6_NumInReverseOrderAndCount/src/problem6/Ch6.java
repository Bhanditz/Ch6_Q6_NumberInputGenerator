/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem6;

import java.util.Scanner;

public class Ch6 {
    
    int numTotal;
    int numValue;
    
    public void setNumTotal(int num) {
     
        if (num <= 0  || num > 50) {
            System.out.println("Error.");
            System.exit(0);
        }
        else {
            numTotal = num;
        } }
    
    public int[] numAmounts(int[] n, int enter) {
        
        n = new int[enter];
        for (int i = 0; i <= n.length; i++) {
            Scanner keyboard = new Scanner(System.in);
            int numValue = keyboard.nextInt();
            n[numValue] = n[i];
        }
        System.out.println(n.length);
        return n;
    }   
      public static void sort(int[] a, int numberUsed) {
        int index, indexOfNextSmallest;
        
        for (index = 0; index < numberUsed - 1; index++) {
            indexOfNextSmallest = indexOfSmallest(index, a, numberUsed);
            interchange(index, indexOfNextSmallest, a);
        }
    }
    private static int indexOfSmallest(int startIndex, int[] a, int numberUsed) {
        int min = a[startIndex];
        int indexOfMin = startIndex;
        int index;
        
        for (index = startIndex + 1; index < numberUsed; index++) {
            if (a[index] > min) {
                min = a[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }
    private static void interchange(int i, int j, int[] a) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
        
        
   

