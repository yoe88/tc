package me.yh.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/11328
public class Main_11328 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        var sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        loop:
        for (int i = 0; i < n; i++) {
            int[] a = new int[26];

            String[] words = br.readLine().split(" ");
            for (var c : words[0].toCharArray()) a[c - 'a']++;
            for (var c : words[1].toCharArray()) a[c - 'a']--;

            for (int x : a) {
                if (x != 0) {
                    sb.append("Impossible\n");
                    continue loop;
                }
            }
            sb.append("Possible\n");
        }
        System.out.println(sb);
    }
}