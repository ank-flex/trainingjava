package singleloop1;

import java.util.Scanner;
 
public class palindrome
{
   public static void main(String args[])
   {
      String s, rev = "";
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string or a number:");
      s = sc.nextLine();

      int length = s.length();
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + s.charAt(i);
 
      if (s.equals(rev))
         System.out.println(s+" is a palindrome");
      else
         System.out.println(s+" is not a palindrome");
 
   }
}