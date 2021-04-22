import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class EscapeRectangle {

	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	static int N, M, H, W, SR, SC, FR, FC, board[][];

	static boolean validate(int x, int y) {
		if (x + H > N || y + W > M)
			return false;

		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (board[x + i][y + j] == 1)
					return false;
			}
		}

		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine());

		N = Integer.parseInt(token.nextToken());
		M = Integer.parseInt(token.nextToken());

		board = new int[N][M];

		for (int i = 0; i < N; ++i) {
			token = new StringTokenizer(reader.readLine());

			for (int j = 0; j < M; ++j) {
				board[i][j] = Integer.parseInt(token.nextToken());
			}
		}

		token = new StringTokenizer(reader.readLine());

		H = Integer.parseInt(token.nextToken());
		W = Integer.parseInt(token.nextToken());
		SR = Integer.parseInt(token.nextToken()) - 1;
		SC = Integer.parseInt(token.nextToken()) - 1;
		FR = Integer.parseInt(token.nextToken()) - 1;
		FC = Integer.parseInt(token.nextToken()) - 1;

		Queue<int[]> q = new LinkedList<>();
		boolean visit[][] = new boolean[N][M];

		q.add(new int[] { SR, SC });
		visit[SR][SC] = true;

		int answer = -1;

		while (!q.isEmpty()) {
			answer++;
			for (int t = 0, end = q.size(); t < end; ++t) {
				int cur[] = q.poll();

				int x = cur[0];
				int y = cur[1];

				if (x == FR && y == FC) {
					System.out.println(answer);
					return;
				}

				for (int i = 0; i < 4; ++i) {
					int X = x + dx[i];
					int Y = y + dy[i];

					if (X < 0 || Y < 0 || X >= N || Y >= M)
						continue;

					if (visit[X][Y])
						continue;

					visit[X][Y] = true;

					if (!validate(X, Y))
						continue;

					q.add(new int[] { X, Y });
				}
			}
		}

		System.out.println("-1");
	}
}
