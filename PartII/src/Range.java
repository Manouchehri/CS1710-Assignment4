/**
 * @author David Manouchehri
 *         Created on 7/17/15 at 6:48 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Range {
    public static void main(String[] args) {
        int[][] user = initalizeArray(5, 5);

        for(int i = 0; i < user.length; i++) {
            System.out.println("Row: " + i +" Min: " + findMinForRow(user[i]) + " Max: " + findMaxForRow(user[i]));
            printRange(findMinForRow(user[i]), findMaxForRow(user[i]));
        }
    }
    public static int[][] initalizeArray(int x, int y) {
        Scanner userInput = new Scanner(System.in); // My compiler works fine having it here, no need to pass it.
        int[][] holder = new int[x][y];

        System.out.println("Please enter a series of " + (x*y) + " numbers.");
        for(int i = 0; i < holder.length; i++)
            for(int j = 0; j < holder[i].length; j++)
                holder[i][j] = userInput.nextInt();

        return holder;
    }
    public static int findMinForRow(int[] input) {
        Arrays.sort(input);
        return input[0];
    }
    public static int findMaxForRow(int[] input) {
        Arrays.sort(input);
        return input[input.length - 1];
    }
    public static void printRange(int min, int max) {
        System.out.println("The range is " + Math.abs(max - min) + ".");
    }
}
