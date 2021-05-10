# BOJ 20291 : 파일 정리

## 🌈 풀이 후기

- 간단한 Map 사용 문제입니다.
- 근데 split(".") 하면 안되고 \\ 을 해야되더군요... 이건 처음 알았습니다
- Map 정렬이 기억이 안나서 찾아보다가 TreeMap을 하면 자동 정렬해주더라고요 !! 아니면 List로 만들어서 comparator 해야 하는듯..!

## 👩‍🏫 문제 풀이

1. 기존에 있는 키인지 확인하고 없었다면 1, 있다면 기본 값의 +1을 더해준다.

```java
Map<String, Integer> map = new TreeMap<>();

for (int i = 0; i < N; i++) {
	String[] str = br.readLine().split("\\.");
	if (!map.containsKey(str[1]))
		map.put(str[1], 1);
	else
		map.put(str[1], map.get(str[1]) + 1);
}
```
