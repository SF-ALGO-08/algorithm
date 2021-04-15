# BOJ 1304번 램프

## 🌈 풀이 후기
두 개의 데이터가 버튼 누르기 전과 후 상태가 두 가지 경우를 활용하여 푸는 문제입니다<br>
여기까지는 알았는데 map에 데이터를 넣고 해도 계속 틀린 값이 나와서 블로그를 참조 했습니다.<br>
K가 홀짝이 중요한 문제였습니다....

## 👩‍🏫 문제 풀이
<br>

### 변수
- N, M(int): 가로, 세로 길이 
- data(String[]): 데이터 문자열
- K(int): 바꿀 수 있는 데아터 수

### 원리
1. 변화 해야되는 데이터 개수 0을 구합니다.
2. 0이 K번 이하이고 홀짝이 맞은 경우 데이터를 확인합니다(다른 경우 반드시 하나는 못킴)
3. 자신과 같은 문자열 개수를 구합니다.
4. 개수를 활용하여 최대값을 갱신합니다.

``` java
for(int i = 0; i < N; i++) {
			int cnt = 0;
			for(int j = 0; j < M; j++) {
				if(data[i].charAt(j) == '0') cnt++; 
			}
			
			if(cnt <= K && cnt % 2 == K % 2) {
				int count = 0;
				for(int j = 0; j < N; j++) {
					if(data[i].equals(data[j])) {
						count++;
					}
				}
				answer = count > answer ? count : answer;
			}
		}
```