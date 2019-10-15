/*
 * Hands-on Java - Basics Part 2 Control Flow - Day 2
 *
 * Next, Caleb talk about flow control using 3 different loop statements.
 * The "While" Loop. Remember "ICU" - Initialization, Condition, and Update. 
 * The "For" Loop example is like the while loop with ICU as a parameter.
 * The "Do While" Loop is like a while loop, but it will run at least once.
 *
 * BLOCK COMMENT OUT LOOPS YOU ARE NOT EVALUATING!
 */

/**
 * @author Mark Orimoloye
 */

public class About_Loops 
{
    public static void main(String[] args) 
    {    
        /*While Loop example
        int i = 0; //Initialization
        while(i < 10) //Condition
        {
            System.out.println("i is: " + i);
            i++; //Update
        }  */
        
        /*For Loop example
        for(int i=0; i<10; i++)
        {
            System.out.println("i is: " + i);
        } */
        
        //Do While Loop Example- will run at least once.
        int i = 0; //Initialization
        do
        {
            System.out.println("i is: " + i);
            i++;
        }
        while(false);
    }
}
