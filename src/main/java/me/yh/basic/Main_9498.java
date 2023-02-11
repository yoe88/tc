package me.yh.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/9498
public class Main_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char c;
        if (N >= 90) {
            c = 'A';
        } else if (N >= 80) {
            c = 'B';
        } else if (N >= 70) {
            c = 'C';
        } else if (N >= 60) {
            c = 'D';
        } else {
            c = 'F';
        }
        System.out.println(c);
    }
}