package com.company;
 import java.util.Locale;
 import java.util.Scanner;
public class Chapter3_Practice_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Problem 1:
        /*
        Write a java program  to convert a string to lowercase
         */

       // System.out.println("Enter a word or sentence ");
       // String str = sc.nextLine();
       // System.out.println(str);
       // System.out.println("Entered string in lower case ");
       // String newsrt = str.toLowerCase();
       // System.out.println(newsrt);

       // Problem 2:
         /*
         Write a java program top replaces spaces with underscores.
          */

        //System.out.println("Enter a word or sentence ");
        //String str = sc.nextLine();
        //String newstr = str.replace(" ", "_");
        //System.out.println(newstr);

        //Problem 3 :
        /*
        Write a java program to fill in a letter template looks like below
        letter = "Dear <|name|> , Thanks a lot.
         */
       // System.out.println("Enter your good name ");
       // String name = sc.next();
       // System.out.println("Dear "+ name + " Thanks a lot!!");

        //Problem 4:
        /*
        Write a java program to detect double and single spaces in a string
         */
        //System.out.println("Enter a word or a sentence");
        //String sent = sc.nextLine();
        //System.out.println(sent.indexOf("  "));
        //System.out.println(sent.indexOf("   "));
        //System.out.println("Double space first come at index " +sent.indexOf("  "));
        //System.out.println("Double space first come at index " +sent.indexOf("   "));


        //Problem 5:
        /*
        Write a program to format the following letter using escape sequence characters
        letter = "Dear Harry, This JAVA course is nice. Thanks!"
         */
        System.out.println("Dear Harry,\n This JAVA course is nice.\n Thanks");

    }
}
