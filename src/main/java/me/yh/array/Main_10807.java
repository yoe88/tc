package me.yh.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10807
public class Main_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (v == x) count++;
        }
        System.out.println(count);
    }
}