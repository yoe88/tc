package me.yh.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2444
public class Main_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) sb.append(" ");
            for (int j = 1; j <= i * 2 - 1; j++) sb.append("*");
            sb.append("\n");
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) sb.append(" ");
            for (int j = 1; j <= i * 2 - 1; j++) sb.append("*");
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void myAnswer(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n * 2 - 1; i++) {
            int s = Math.abs(n - i);
            for (int j = 1; j <= s; j++) sb.append(" ");
            for (int k = 1; k <= (n - s) * 2 - 1; k++) sb.append("*");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}