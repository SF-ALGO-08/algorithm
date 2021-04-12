# BOJ 12847번 꿀 아르바이트

## 🌈 풀이 후기
계속 값을 더해나가면서 이전 값은 빼는 간단한 누적합 문제였습니다. <br>
LONG으로 안써서 한번 문제를 틀렸습니다.


## 👩‍🏫 문제 풀이
<br>

### 변수
- N, M(int): 데이터의 총 개수, 연속되야할 데이터 수
- money(long[]): 블록의 크기

### 원리
1. 1부터 M까지 데이터는 미리 합하면서 데이터를 계속 누적합니다.
2. M이상 부터는 각 데이터를 더하고 i - M데이터를 빼면서 누적합을 구합니다.
3. 누적합의 최대값을 출력합니다.

``` java
// 1부터 M까지 데이터 미리 더하기
for(int i = 1; i <= M; i++) {
	money[i] = money[i - 1] + Integer.parseInt(st.nextToken());
}

// 기본 최대값 설정
long answer = money[M];
		
for(int i = M + 1; i <= N; i++) {
        // 계속 한자리씩 더하기
	money[i] = money[i - 1] + Integer.parseInt(st.nextToken());
	
        // 최대값 갱신하기
        answer = money[i] - money[i - M] > answer ? money[i] - money[i - M] : answer;
}

```