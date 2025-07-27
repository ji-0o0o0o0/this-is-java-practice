
# 📘 Chapter 05. 배열 (Array)

자바에서 배열은 **같은 타입의 데이터를 하나의 변수 이름으로 여러 개 저장**할 수 있는 자료구조입니다.  
자바 배열은 고정 길이이며, 객체로 취급됩니다.

---

## 🧩 1. 배열 선언과 생성

### ✅ 선언
```java
int[] scores;
```

또는
```java
int scores[];
```

### ✅ 생성
```java
scores = new int[5]; // 정수형 배열 5개 생성 (기본값 0)
```

### ✅ 선언과 생성을 동시에
```java
int[] scores = new int[5];
```

---

## ✨ 2. 배열 초기화

### ✅ 기본값 (new 키워드 사용 시 자동 초기화)

| 타입 | 기본값 |
|------|--------|
| int, short, byte | 0 |
| double, float | 0.0 |
| boolean | false |
| char | '\u0000' |
| 참조형 (String 등) | null |

### ✅ 직접 초기화
```java
int[] scores = {90, 70, 80};
```

또는
```java
int[] scores = new int[] {90, 70, 80};
```

---

## 🔁 3. 배열 접근

### ✅ 인덱스 접근
```java
scores[0] = 100;
System.out.println(scores[1]);
```

> 인덱스는 0부터 시작하며, 범위를 벗어나면 `ArrayIndexOutOfBoundsException` 발생

### ✅ 배열 길이
```java
int length = scores.length;
```

---

## 🔁 4. 배열 반복

### ✅ 일반 for문
```java
for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}
```

### ✅ 향상된 for문 (for-each)
```java
for (int score : scores) {
    System.out.println(score);
}
```

> 단, 인덱스가 필요할 경우 일반 for문 사용

---

## 🧠 5. 배열 활용 예제

### ✅ 최대값, 최소값 구하기
```java
int max = scores[0];
for (int score : scores) {
    if (score > max) max = score;
}
```

### ✅ 합계 및 평균
```java
int sum = 0;
for (int score : scores) sum += score;
double avg = (double) sum / scores.length;
```

---

## 🧊 6. 다차원 배열

### ✅ 2차원 배열 선언과 생성
```java
int[][] matrix = new int[2][3];
```

### ✅ 초기화
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```

### ✅ 접근
```java
System.out.println(matrix[0][1]); // 2
```

---

## 🧪 연습 문제 예시

1. 입력된 정수들의 최대/최소/합계/평균 구하기
2. 학생 성적 저장 후 평균 이상인 학생 출력
3. 2차원 배열을 이용한 좌석 예매 시스템
4. 배열 요소를 역순으로 출력
5. 배열을 복사해서 크기를 늘리는 코드 작성

---

## 📌 요약 정리

| 개념 | 설명 |
|------|------|
| 배열 선언 | `int[] arr;` 또는 `int arr[];` |
| 배열 생성 | `new int[5]` |
| 배열 초기화 | `{1,2,3}`, `new int[]{1,2,3}` |
| 반복 출력 | `for`, `for-each` |
| 배열 길이 | `arr.length` |
| 다차원 배열 | `int[][] arr = new int[2][3];` |

