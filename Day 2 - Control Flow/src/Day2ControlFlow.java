/*
 * Hands-on Java - Basics Part 2 Control Flow - Day 2
 * Caleb had issues with setting up git... haha.. It was a bit funny.
 * I already had git good to go thru plugins on my Netbeans IDE.
 * Anyway, I love Caleb's raw and real video format.  He is awesome~!
 *
 * Caleb talks about "control flow statements" like the If Statement.
 * Branching and Looping are two different types of control flow.
 *
 * When you use "Scanner in" make sure you close the Scanner with "in.close()"
 * to release memory!
 *
 * This is a very simple program that shows the value of branching.
 * You could have an application behave differently based on input from a 
 * configuration file for example.
 */

/**
 * @author Mark Orimoloye
 */
import java.util.Scanner;

public class Day2ControlFlow
{

    public static void main(String[] args) 
    {
        System.out.println("Hello, and you are? ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        // An example of branching with the If Statement
        if(s.equals("Mark"))
        {
            System.out.println("Hi Mark~!");
        }
        else if (s.equals("Caleb"))
        {
            System.out.println("Master Caleb, welcome~!");
        }
        else
        {
            System.out.println("Hi, I don't know who you are.  Can I help you? o.O <-- blink blink...");
        }
        in.close();
    }
    
}
