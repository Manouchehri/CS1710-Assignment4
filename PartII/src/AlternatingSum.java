/**
 * @author David Manouchehri
 *         Created on 7/17/15 at 4:53 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 307, Question P6.6
 */
public class AlternatingSum {
    public static void main(String[] args) {
        int[] sample = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        System.out.println(altSum(sample));
    }
    public static int altSum(int[] input) {
        int holder = 0;
        int flip = 1;
        for(int i = 0; i < input.length; i++, flip*=-1)
            holder += input[i]*flip;

        return holder;
    }
}
