# BOJ 15666번 [N과 M (12)](http://noj.am/15666)

## 🌈 풀이 후기
- Set<Integer> 에서 Integer[]로 toArray()를 통해서는 바로 못넣음.
    1. Object[]로 선언하기.
    2. 초기화 후, `set.toArray(arr)`
    3. Stream이용
## 👩‍🏫 문제 풀이
- 처음 입력받을 때, Set을 이용해서 중복을 제거.
- TreeMap을 이용해 오름차순으로 만든 뒤,
- array에 옮기고 이를 이용해 순차적으로 조합 생성.
