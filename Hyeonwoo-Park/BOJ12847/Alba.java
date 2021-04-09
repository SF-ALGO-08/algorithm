import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Alba {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine());

		int N = Integer.parseInt(token.nextToken()), M = Integer.parseInt(token.nextToken());
		long sum[] = new long[N + 1];

		token = new StringTokenizer(reader.readLine());

		for (int i = 1; i <= N; ++i)
			sum[i] = sum[i - 1] + Integer.parseInt(token.nextToken());

		long maximum = 0;

		for (int i = M; i <= N; ++i)
			maximum = Math.max(maximum, sum[i] - sum[i - M]);

		System.out.println(maximum);
	}
}
