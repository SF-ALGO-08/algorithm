# BOJ 5567번 결혼식

## 🌈 풀이 후기
간단하게 전체를 조사하는 문제였습니다. <br>

ArrayList 초기화 할때 이렇게 하면 편할 줄 알았는데 모든 해시코드 값이 같아지면서 오류가 발생하네요ㅠㅠ
``java
Arrays.fill(friendList, new ArrayList<>());
``

## 👩‍🏫 문제 풀이
<br>

## 변수
- N(int) - 동기의 수
- M(int) - 친구 연결 길이
- friendList(ArrayList<Integer>[] friendList) - 각자의 친구 리스트
- visited(boolena[]) - 상근이의 친구 처리


## 원리
1. 상근이의 친구들을 전부 조사하여 visited 방문 처리
2. 상근이의 친구들을 전부 초대(합산)
3. 상근이의 친구들중에서 visited되지 않은 친구들 초대
4. 초대된 친구들 수 출력