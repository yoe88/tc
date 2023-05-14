package me.yh.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1475
public class Main_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        for (char c : br.readLine().toCharArray()) {
            int n = c - 48;
            if (n == 9) {
                arr[6]++;
                continue;
            }
            arr[n]++;
        }
        arr[6] = (arr[6] + 1) / 2;

        int max = 0;
        for (int i : arr) {
            if (max < i) max = i;
        }
        System.out.println(max);
    }
}