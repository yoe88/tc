package me.yh.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1919
public class Main_1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[26];
        String w1 = br.readLine();
        String w2 = br.readLine();

        for (var c : w1.toCharArray()) a[c - 'a']++;
        for (var c : w2.toCharArray()) a[c - 'a']--;

        int count = 0;
        for (var n : a) {
            if (n != 0) count += Math.abs(n);
        }
        System.out.println(count);
    }
}