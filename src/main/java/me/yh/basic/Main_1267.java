package me.yh.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1267
public class Main_1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int y = 0, m = 0;

        int length = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            int n = Integer.parseInt(st.nextToken());
            y += ((n / 30) + 1) * 10;
            m += ((n / 60) + 1) * 15;
        }
        StringBuilder sb = new StringBuilder();
        if (m < y) {
            sb.append("M ");
        } else if (m == y) {
            sb.append("Y M ");
        } else {
            sb.append("Y ");
        }
        sb.append(Math.min(y, m));
        System.out.println(sb);
    }
}