package BitManipulation;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] ans = (flipAndInvertImage(image));
        for (int[] row : ans)
            System.out.println(Arrays.toString(row));

    }

    public static int[][] flipAndInvertImage(int[][] image) {
                for (int[] row : image) {
                    int left = 0;
                    int right = row.length - 1;
                    while (left <= right) {
                        int temp = row[left] ^ 1;
                        row[left] = row[right] ^ 1;
                        row[right] = temp;
                        left++;
                        right--;
                    }
                }
                return image;
            }
        }