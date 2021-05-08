import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Domino {

	static int dx[] = { -1, 0, 0, 1 };
	static int dy[] = { 0, 1, -1, 0 };
	static String NEWS = "NEWS";

	static int N, M, R, domino[][];

	static int fall(int x, int y, int dir) {
		if (x < 0 || y < 0 || x >= N || y >= M)
			return 0;
		if (domino[x][y] < 0)
			return 0;

		int height = domino[x][y];
		domino[x][y] *= -1;

		int sum = 1;

		for (int i = 1; i < height; ++i) {
			x += dx[dir];
			y += dy[dir];

			sum += fall(x, y, dir);
		}

		return sum;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine());
		N = Integer.parseInt(token.nextToken());
		M = Integer.parseInt(token.nextToken());
		R = Integer.parseInt(token.nextToken());

		domino = new int[N][M];

		int score = 0;

		for (int i = 0; i < N; ++i) {
			token = new StringTokenizer(reader.readLine());

			for (int j = 0; j < M; ++j)
				domino[i][j] = Integer.parseInt(token.nextToken());
		}

		for (int i = 0; i < R; ++i) {
			token = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(token.nextToken()) - 1;
			int y = Integer.parseInt(token.nextToken()) - 1;
			int dir = NEWS.indexOf(token.nextToken());

			score += fall(x, y, dir);

			token = new StringTokenizer(reader.readLine());
			x = Integer.parseInt(token.nextToken()) - 1;
			y = Integer.parseInt(token.nextToken()) - 1;

			if (domino[x][y] < 0)
				domino[x][y] *= -1;
		}

		System.out.println(score);
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				System.out.print(domino[i][j] > 0 ? "S " : "F ");
			}
			System.out.println();
		}
	}
}
