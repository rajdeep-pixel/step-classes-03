package arrays.assigment_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> prefixSumCounts = new HashMap<>();
        prefixSumCounts.put(0, 1);
        int currentSum = 0;
        int totalSubarrays = 0;
        for (int num : nums) {
            currentSum += num;
            if (prefixSumCounts.containsKey(currentSum - k)) {
                totalSubarrays += prefixSumCounts.get(currentSum - k);
            }
            prefixSumCounts.put(currentSum, prefixSumCounts.getOrDefault(currentSum, 0) + 1);
        }
        return totalSubarrays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int count = subarraySum(nums, k);
        System.out.println("Subarrays Sum Equals K: " + count);
        sc.close();
    }
}