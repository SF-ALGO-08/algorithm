package com.Boj.seoul8.week10;

import java.util.Scanner;

public class BOJ_S1_18222_투에모스문자열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong() - 1; // 0부터 시작

		int bit = Long.bitCount(k);

		// 비트카운트가 짝수면 0, 홀수면 1
		if (bit % 2 == 0)
			System.out.println(0);
		else
			System.out.println(1);

	}

}

