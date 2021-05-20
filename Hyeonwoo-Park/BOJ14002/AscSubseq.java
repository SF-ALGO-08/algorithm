import java.util.Scanner;

public class AscSubseq {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] arr = new int[N];
		int[][] dp = new int[N][2];

		for (int i = 0; i < N; ++i)
			arr[i] = scanner.nextInt();

		scanner.close();

		int max = 0;
		int pos = 0;

		for (int i = 0; i < N; ++i) {
			int cur = arr[i];
			int len = dp[i][1] + 1;

			if (max < len) {
				max = len;
				pos = i;
			}

			for (int j = i + 1; j < N; ++j) {
				if (arr[j] > cur && dp[j][1] < len) {
					dp[j][0] = i;
					dp[j][1] = len;
				}
			}
		}

		int answer[] = new int[max];
		
		System.out.println(max);

		while (max > 0) {
			answer[--max] = arr[pos];

			pos = dp[pos][0];
		}

		for(int num : answer)
			System.out.print(num + " ");
	}
}
