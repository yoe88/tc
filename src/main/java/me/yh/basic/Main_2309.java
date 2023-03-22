package me.yh.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/2309
public class Main_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }
        Arrays.sort(nums);

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - nums[i] - nums[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) continue;
                        System.out.println(nums[k]);
                    }
                    return;
                }
            }
        }
    }

    public static void myAnswer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] result = new int[7];
        for (int i = 0; i < 8; i++) {
            int sum = 0;
            for (int j = i + 1; j < 9; j++) {
                int n = 0;
                sum = 0;
                for (int c = 0; c < 9; c++) {
                    if (c == i || c == j) continue;
                    result[n++] = arr[c];
                    sum += arr[c];
                }
                if (sum == 100) break;
            }
            if (sum == 100) break;
        }
        Arrays.sort(result);
        for (int i : result) {
            System.out.println(i);
        }
    }
}