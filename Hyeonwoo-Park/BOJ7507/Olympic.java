import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Olympic {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;

		int N = Integer.parseInt(reader.readLine());

		for (int scenario = 1; scenario <= N; ++scenario) {
			int M = Integer.parseInt(reader.readLine());
			int times[][] = new int[M][];

			for (int i = 0; i < M; ++i) {
				token = new StringTokenizer(reader.readLine(), " ");

				int d = Integer.parseInt(token.nextToken());
				int s = Integer.parseInt(token.nextToken());
				int e = Integer.parseInt(token.nextToken());

				times[i] = new int[] { d, s, e };
			}

			Arrays.sort(times, (a, b) -> {
				if (a[0] == b[0]) {
					return a[2] - b[2];
				} else {
					return a[0] - b[0];
				}
			});

			int today = 0;
			int current = 0;
			int count = 0;

			for (int[] time : times) {
				if (time[0] > today) {
					count++;
					today = time[0];
					current = time[2];

					continue;
				}

				if (time[1] < current)
					continue;

				count++;
				current = time[2];
			}

			System.out.println("Scenario #" + scenario + ":");
			System.out.println(count);
			System.out.println();
		}
	}
}
