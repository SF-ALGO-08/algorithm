import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class FileArrangement {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());

		Map<String, Integer> map = new TreeMap<>();

		for (int i = 0; i < N; ++i) {
			String inp = reader.readLine().split("\\.")[1];
			if (!map.containsKey(inp))
				map.put(inp, 0);
			
			map.put(inp, map.get(inp) + 1);
		}
		
		map.forEach((a, b)-> {
			System.out.println(a + " " + b);
		});
	}
}
