/**
 * @author David Manouchehri
 *         Created on 7/17/15 at 8:11 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 *
 *         Page 312, Question P6.28
 */

import java.util.ArrayList;
import java.util.Collections;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<Integer> list_1 = new ArrayList<Integer>();
        // Sample data from book.
        list_1.add(1);
        list_1.add(4);
        list_1.add(9);
        list_1.add(16);

        ArrayList<Integer> list_2 = new ArrayList<Integer>();
        // Sample data from book.
        list_1.add(4);
        list_1.add(7);
        list_1.add(9);
        list_1.add(9);
        list_1.add(11);

        System.out.println(mergeSorted(list_1, list_2));
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> merged = new ArrayList<Integer>();

        merged.addAll(a);
        merged.addAll(b);

        Collections.sort(merged); // Much faster than doing it manually.
        return merged;
    }
}
