package me.yh.basic;

import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10871
public class Main_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            int n = Integer.parseInt(st.nextToken());
            if (n < X) sb.append(n).append(" ");
        }
        System.out.println(sb);
    }
}