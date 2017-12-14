/**
 * @author Z
 * @since 13 December 2017
 */

import java.util.Scanner;

public class CountingAndLooping
{
    private final static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args)
    {
        int iResultant = 0;
        int iTimes = PromptInt("Number of times: ");

        for (int i = 1; i <= iTimes; i++)
        {
            System.out.println(String.format("%d I love Computer Science!!", i));
            iResultant += i;
        }

        System.out.println("Sum: " + iResultant);
    }

    private static int PromptInt(String question)
    {
        System.out.print(question);

        while (!SCAN.hasNextInt())
        {
            System.out.flush();

            System.out.print("Whole number only: ");

            SCAN.next();
        }

        return SCAN.nextInt();
    }
}
