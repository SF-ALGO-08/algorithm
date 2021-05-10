package com.Boj.seoul8.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S1_15486_퇴사2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;

		int[] dp = new int[N + 1];
		int max = 0;
		int[] T = new int[N + 1];
		int[] P = new int[N + 1];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i <= N; i++) {
			max = Math.max(dp[i], max);

			if (i + T[i] < N + 1) {
				dp[i + T[i]] = Math.max(dp[i + T[i]], max + P[i]);
			}
		}

		System.out.println(max);

	}

}

