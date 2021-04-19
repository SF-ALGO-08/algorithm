# BOJ 16973번 [직사각형 탈출](http://noj.am/16973)

## 🌈 풀이 후기
- 범위로 validate 체크하는 문제라 참신했네요.
## 👩‍🏫 문제 풀이
- validate 체크하면서 bfs.
- 모든 validate를 체크한 후 `visit[x][y]`를 검사하니, 쓸모없는 검사가 너무 많아짐.
- 따라서, 아래 순서로 진행
    1. x, y에 대해 boundary 체크만 실시.
    2. visit 검사
    3. 나머지 validate 체크.
