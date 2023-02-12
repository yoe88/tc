package me.yh.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2480
public class Main_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        if (arr[0] == arr[2]) {
            System.out.println(10000 + arr[0] * 1000);
        } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
            System.out.println(1000 + arr[1] * 100);
        } else {
            System.out.println(arr[2] * 100);
        }
    }

    static void generalAnswer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b || a == c) {
            System.out.println(1000 + a * 100);
        } else if (b == c) {
            System.out.println(1000 + b * 100);
        } else {
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        }
    }

    static void myAnswer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[7];
        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(st.nextToken());
            arr[n]++;
        }

        int max = 1;
        for (int i = 6; i > 0; i--) {
            if (arr[i] == 3) {
                System.out.println(10000 + i * 1000);
                return;
            } else if (arr[i] == 2) {
                System.out.println(1000 + i * 100);
                return;
            } else if (arr[i] == 1) {
                if (max < i) max = i;
            }
        }
        System.out.println(max * 100);
    }
}