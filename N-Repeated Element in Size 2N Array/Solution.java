import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Solution {
    public static int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int i : nums) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        int maxCount = 0;
        int result = nums[0];

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces (e.g., 1 2 3):");
        String line = scanner.nextLine();
        String[] parts = line.trim().split("\s+");

        int[] digits = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            digits[i] = Integer.parseInt(parts[i]);
        }

        int result = repeatedNTimes(digits);

        System.out.println("Output: " + result);
        scanner.close();
    }
}
