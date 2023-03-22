package me.yh.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10804
public class Main_10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[21];
        for (int i = 1; i <= 20; i++) nums[i] = i;

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int length = (b - a + 1) / 2;
            for (int j = 0; j < length; j++) {
                int tmp = nums[a + j];
                nums[a + j] = nums[b - j];
                nums[b - j] = tmp;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 20; i++) {
            sb.append(nums[i]).append(" ");
        }
        System.out.println(sb);
    }
}