# BOJ 16973번 [직사각형 탈출](https://www.acmicpc.net/problem/16973)



## 🌈 풀이 후기

누적합 문제인지 모르고 풀었네요 ! 

그리고 함수 만들기 귀찮아서 main문 안에서 다했습니다,,

## 👩‍🏫 문제 풀이

누적합 방법 말고 계속 반복 돌면서 확인하는 방식으로 풀었을 때 계속 시간초과 났는데 범위체크를 더 타이트하게 해주니까 통과했습니다 . 하지만 시간 간당간당하게 통과된 것 같고 누적합 방법을 쓰는게 좋을것 같아요

```java
// 시간초과
if(nx<1 || nx>N || ny<1 || ny>M || visit[nx][ny])	continue;
				
for (int i = nx; i < nx+H; i++)
  for (int j = ny; j < ny+W; j++) 
    if(i<1 || i>N || j<1 || j>M || map[i][j])	continue dir;	
```

```java
// 통과
if(nx<1 || nx>N-H+1 || ny<1 || ny>M-W+1 || visit[nx][ny])	continue;
				
for (int i = nx; i < nx+H; i++)
  for (int j = ny; j < ny+W; j++)
    if(map[i][j])	continue dir;	
```

