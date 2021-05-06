# BOJ 2251번 물통

## 🌈 풀이 후기
알고리즘 분류를 보고 BFS문제 인것을 알게 되었습니다.<br>
BFS를 하면서 전수 조사를 하였습니다.<br>
입력 값이 3개 밖에 없어서 Buffer대신 Scanner를 활용했습니다.



## 👩‍🏫 문제 풀이
<br>

### 변수
- bollte(int[]): 물통 A, B, C의 값
- visited(boolean[][][]): 각 A,B,C에 대해서 해당값 조사 여부
- queue(Queue<int[]>): 각 노드마다 진행되는 BFS를 확인하기 위한 Queue


### 원리
1. A는 0, B는 0을 넣고 C는 전부 넣은 상태를 시작으로 값을 Queue를 시작합니다.
2. 현재 값이 조사가 안되었는지 확인을 한 후에 조사가 안된 값들은 전수 조사합니다.
3. 2중 for문을 통해서 j의 물을 i의 물통에 넣으면서 BFS를 추가합니다. <br>
3-1. 만약 넣어야 되는 값이 병의 크기를 초월한다면 나머지 값은 그대로 남겨둡니다.<br>
3-2. 만약 넣어야 되는 값이 병의 크기를 넘지 않는 다면 전부 추가합니다 <br>
4. 현재의 A,B,C값을 queue에 넣고 계속 실행합니다.
5. 계속되는 BFS를 통해서 answer값에 C의 값을 계속 넣습니다.


### 핵심코드
```java
// j에 있는 물을 i에 넣는다

for (int i = 0; i < 3; i++) {
	for (int j = 0; j < 3; j++) {
		if (i == j)
			continue;

		int[] next = Arrays.copyOf(now, 3);
		int sum, rest;
		if (now[i] + now[j] > bottle[i]) {
			sum = bottle[i];
			rest = now[i] + now[j] - bottle[i];
		} else {
			sum = now[i] + now[j];
			rest = 0;
		}
		next[i] = sum;
		next[j] = rest;
		queue.add(next);
	}
}
```