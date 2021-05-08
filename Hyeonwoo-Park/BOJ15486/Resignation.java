import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Resignation {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int[][] counseling = new int[N][2];
		int dp[] = new int[N + 1];

		for (int i = 0; i < N; ++i) {
			counseling[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(v -> Integer.parseInt(v)).toArray();
		}

		for (int i = N - 1; i >= 0; --i) {
			int period = counseling[i][0];
			int money = counseling[i][1];

			if (i + period <= N)
				dp[i] = Math.max(money + dp[i + period], dp[i + 1]);
			else
				dp[i] = dp[i + 1];
		}

		System.out.println(dp[0]);
	}
}
