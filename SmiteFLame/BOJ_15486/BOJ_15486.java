package SmiteFLame.BOJ_15486;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15486 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(in.readLine());
		int[] DP = new int[N + 1];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine());

			// 진행되는 일정 및 금액
			int during = Integer.parseInt(st.nextToken());
			int price = Integer.parseInt(st.nextToken());

			// 해당하는 날짜에 데이터를 넣을 수 있는 경우에만 데이터를 추가하기
			if (i + during <= N) {
				DP[i + during] = DP[i + during] > DP[i] + price ? DP[i + during] : DP[i] + price;
			}

			// 다음 날 날짜를 현재 날짜와 비교해서 최대값을 갱신하기
			DP[i + 1] = DP[i] > DP[i + 1] ? DP[i] : DP[i + 1];
		}

		// 마지막 날짜의 값을 출력하기
		System.out.println(DP[N]);
	}
}
