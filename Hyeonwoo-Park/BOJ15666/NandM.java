import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NandM {

	static Integer[] numbers;
	static int N, M;

	static void dfs(String answer, int cur, int len) {
		if(len == M) {
			System.out.println(answer);
			
			return;
		}
		
		for(int i = cur, end = numbers.length; i < end; ++i) {
			dfs(answer + numbers[i] + " ", i, len + 1);	
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		M = scanner.nextInt();
		
		Set<Integer> s = new TreeSet<Integer>();

		for (int i = 0; i < N; ++i)
			s.add(scanner.nextInt());
		scanner.close();
		
		numbers = s.stream().toArray(Integer[]::new);
		
		dfs("", 0, 0);
	}
}
