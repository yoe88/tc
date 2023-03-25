package me.yh.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2446
public class Main_2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n * 2 - 1; i++) {
            int k = Math.abs(n - i);
            for (int j = 1; j < n - k; j++) sb.append(" ");
            for (int j = 1; j <= k * 2 + 1; j++) sb.append("*");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
