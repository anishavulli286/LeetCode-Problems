package FourDivisors;

import java.util.Scanner;

public class Solution {

    public static int fourDivisors(int[] num) {
        int totalCount = 0;

        for (int n : num) {
            int count = 0;
            int sum = 0;

            for(int i = 0; i * i <= n; i++) {
                
            }
        }

        return totalCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of numbers: ");
        String n = sc.nextLine().trim();
        String values = n.substring(1,n.length() - 1);
        String[] parts = values.split(",");
        int[] nums = new int[parts.length];
        for(int i = 0; i<parts.length ; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
        System.out.println("Output : " + fourDivisors(nums));
        sc.close();
    }
}
