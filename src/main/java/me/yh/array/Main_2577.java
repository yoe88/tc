package me.yh.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2577
public class Main_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int s = a * b * c;

        StringBuilder sb = new StringBuilder();
        while (s > 0) {
            arr[s % 10]++;
            s /= 10;
        }
        for (int i : arr) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}