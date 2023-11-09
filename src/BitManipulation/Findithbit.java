/*
In this code i kept track of how many 'A' and 'B' characters are visited at even and odd positions, and only increased the count of characters if they appear at even pos in the alternating pattern. Removals are counted when characters appear at odd positions
 */

package BitManipulation;

public class Findithbit {
    public static void main(String[] args) {
        String input = "AABBAABB";
        System.out.println(find(input));

    }
    public static int find(String str){
        int aCount = 0;
        int bCount = 0;
        int removals = 0;
        int aVisited = 0;
        int bVisited = 0;

        for (char c : str.toCharArray()) {
            if (c == 'A') {
                aCount++;
                if (aVisited % 2 == 1) {
                    aCount--;
                    removals++;
                }
                aVisited++;
            } else if (c == 'B') {
                bCount++;
                if (bVisited % 2 == 1) {
                    bCount--;
                    removals++;
                }
                bVisited++;
            }
        }

        return removals;


    }
}
