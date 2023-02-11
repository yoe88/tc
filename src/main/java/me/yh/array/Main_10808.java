package me.yh.array;

import java.io.*;

//https://www.acmicpc.net/problem/10808
public class Main_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int[] arr = new int[26];
        for (char c: S.toCharArray()) {
            arr[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}