package NumberOfWaysToPaint;

import java.util.Scanner;

public class Solution {
    private static final int MOD = 1_000_000_007;
    public static int numOfWays(int n) {
        long abc = 6; // all different
        long aba = 6; // first and third same

        for (int i = 2; i <= n; i++) {
            long newAbc = (abc * 2 + aba * 2) % MOD;
            long newAba = (abc * 2 + aba * 3) % MOD;

            abc = newAbc;
            aba = newAba;
        }

        return (int) ((abc + aba) % MOD);
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Number of ways: " + numOfWays(n));

        sc.close();
    }
}