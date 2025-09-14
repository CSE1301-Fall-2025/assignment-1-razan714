import java.util.Scanner;

public class Nim {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many sticks are there?");
    int blank = input.nextInt();
    
    while (blank >= 0) {
        System.out.println("There are "+ blank + " sticks");
    System.out.println("Human draw "); 
    int blank2 = input.nextInt();
    int blank3 = blank - blank2;
    System.out.println("Human drew " + blank2 + " sticks");
    blank = blank3;   
    if (blank2 > 2) {System.out.println("Illegal move");
    continue; }
    
        else if (blank2 <= 2) { System.out.println("Sticks left are " + blank3);
      }
      if (blank <= 0)
      System.out.println("Human took the last stick. Human Wins!");


    int choice = (int)(Math.random() * 2) + 1;
    System.out.println("Computer chose: " + choice);
    int blank4 = blank3 - choice;
     blank = blank4;
     if (blank <= 0) {
        System.out.println("Computer took the last stick — Computer wins!");
    
    System.out.println( "Sticks left are "+ blank4 ); }
    if (blank == 0) {System.out.println ("Game over! Thank you for playing"); } 

       }


} }


