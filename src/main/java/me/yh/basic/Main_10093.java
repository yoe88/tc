package me.yh.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10093
public class Main_10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        if (a > b) {
            long tmp = a;
            a = b;
            b = tmp;
        }

        if (a == b || b - a == 1) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(b - a - 1).append("\n");
        for (long i = a + 1; i < b; i++) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}