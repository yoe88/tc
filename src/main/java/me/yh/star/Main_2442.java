package me.yh.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2442
public class Main_2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1 - i; j++) sb.append(" ");
            for (int j = 0; j < i * 2 + 1; j++) sb.append("*");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}