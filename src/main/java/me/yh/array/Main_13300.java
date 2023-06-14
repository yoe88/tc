package me.yh.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/13300
public class Main_13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] s = new int[2][7];
        int room = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            s[gender][year]++;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 7; j++) {
                room += Math.ceil((double) s[i][j] / max);
            }
        }

        System.out.println(room);
    }
}

