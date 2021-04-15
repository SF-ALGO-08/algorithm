import java.util.Scanner;

public class Lamp {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(), M = scanner.nextInt(), maximum = 0;
		scanner.nextLine();

		boolean lamps[][] = new boolean[N][M];

		for (int i = 0; i < N; ++i) {
			char[] inp = scanner.nextLine().toCharArray();

			for (int j = 0; j < M; ++j) {
				if (inp[j] == '1')
					lamps[i][j] = true;
			}
		}

		int K = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < N; ++i) {
			int zero = 0;
			int count = 0;

			for (boolean lamp : lamps[i]) {
				if (!lamp)
					zero++;
			}

			if (zero > K)
				continue;

			if ((K - zero) % 2 == 1)
				continue;

			loop: for (int j = i; j < N; ++j) {
				for (int k = 0; k < M; ++k) {
					if (lamps[i][k] ^ lamps[j][k])
						continue loop;
				}

				count++;
			}

			maximum = maximum < count ? count : maximum;
		}

		System.out.println(maximum);
	}
}
