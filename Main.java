/*
File Name: main.java
Name: Amar Panjwani
Description: This programs reads a word from the user and prints it word in reverse. 
Date: 03/16/21
Email: panjwania@student.vvc.edu
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter a word: ");
    String word = in.next();

    for (int i = word.length() - 1; i >= 0; i--)
    {
      System.out.print(word.charAt(i));
    }
    System.out.println();
  }
}