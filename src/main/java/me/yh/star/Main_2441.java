package me.yh.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2441
public class Main_2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int j = 0;
            for (; j < i; j++) sb.append(" ");
            for (; j < length; j++) sb.append("*");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}