package me.yh.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/3273
public class Main_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] exist = new boolean[2000001];
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sum - arr[i] > 0 && exist[sum - arr[i]]) count++;
            exist[arr[i]] = true;
        }

        System.out.println(count);
    }
}