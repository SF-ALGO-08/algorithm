import java.util.Scanner;

public class ThueMorse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long k = scanner.nextLong() - 1;
		scanner.close();

		int answer = 0;

		while (k > 0) {
			answer ^= (k & 1);
			k >>= 1;
		}
		
		System.out.println(answer);
	}
}
