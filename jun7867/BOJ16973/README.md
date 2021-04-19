# BOJ 16973 : 직사각형 탈출

## 🌈 풀이 후기

- 시뮬레이션치고 쉬웠습니다.
- 소트 게임은 블로그 해설을 봐도 이해가 안돼요....

## 👩‍🏫 문제 풀이

1. 범위 내에 벽이 있으면 안된다. 이 점을 유의하고 bfs를 돌리면 된다.


```java
private static boolean wallCheck(int nr, int nc) {
  for (int i = nr; i < nr + H; i++) {
    for (int j = nc; j < nc + W; j++) {
      if (map[i][j] == 1)
        return false;
    }
  }
  return true;
}

```
