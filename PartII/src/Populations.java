/**
 * @author David Manouchehri
 *         Created on 7/17/15 at 4:54 PM.
 *         All content is under the MIT License unless otherwise specified.
 *         See LICENSE.txt for details.
 */
public class Populations {
    public static void main(String[] args) {
        final String[] countries = {"China", "India", "United States", "Indonesia", "Brazil", "Pakistan", "Nigeria", "Bangladesh", "Russia", "Japan"};
        final long[] populations = {1370990000l, 1274250000l, 321423000l, 255461700l, 204614000l, 190366000l, 183523000l, 158690000l, 146524812l, 126890000l};
        display(countries, populations);
    }
    public static void display(String[] country, long[] population) {
        final long WORLDPOP = 7250000000l;
        for(int i = 0; i < country.length; i++)
            System.out.printf("%-15s %-15d %10.2f%% %n", country[i], population[i], (float)population[i] / WORLDPOP * 100);
    }
}
