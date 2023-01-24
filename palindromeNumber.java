import java.util.Scanner;
public class palindromeNumber {

     static boolean isPalindrome (int number){
         int interim = number;
         int reverseNumber =0;
         int lastStep;

         while (interim != 0){
             lastStep = interim % 10;
             reverseNumber = (reverseNumber * 10) + lastStep;
             interim /= 10;

         }
         return number == reverseNumber;
     }

    public static void  main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int number = input.nextInt();
        boolean isPalindrome = isPalindrome(number);

        if (isPalindrome(number))
            System.out.println(number + " is a Palindrome Number.");
        else
            System.out.println(number + " isn't a Palindrome Number.");

    }
}
