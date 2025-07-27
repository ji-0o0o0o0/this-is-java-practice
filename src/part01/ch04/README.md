
# 📘 Chapter 04. 조건문과 반복문

자바에서 **프로그램의 흐름을 제어**하는 데 사용하는 기본적인 구문들입니다.  
조건문(`if`, `switch`)과 반복문(`for`, `while`, `do-while`)이 핵심입니다.

---

## 🧩 1. 조건문 (Conditional Statements)

### ✅ if 문
```java
if (조건식) {
    // 조건이 true일 때 실행
}
```

### ✅ if-else 문
```java
if (조건식) {
    // true일 때
} else {
    // false일 때
}
```

### ✅ if-else if-else 문
```java
if (조건1) {
    ...
} else if (조건2) {
    ...
} else {
    ...
}
```

### ✅ 중첩 if문
```java
if (조건1) {
    if (조건2) {
        ...
    }
}
```

---

## 🧠 2. switch 문

- 조건식 결과가 `byte`, `short`, `char`, `int`, `String`, `enum` 일 때 사용
- break가 없으면 **fall through(하위 코드 계속 실행)** 발생

```java
switch (변수) {
    case 값1 -> 실행문;
    case 값2 -> 실행문;
    default -> 실행문;
}
```

> Java 14 이후 `switch`에 `->` 사용 가능 (expression 방식)

---

## 🔁 3. 반복문 (Loop Statements)

### ✅ for 문

- 반복 횟수가 명확할 때 사용

```java
for (초기화; 조건식; 증감식) {
    ...
}
```

예:
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### ✅ 중첩 for문

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 2; j++) {
        System.out.println(i + ", " + j);
    }
}
```

---

### ✅ while 문

- 조건이 true인 동안 반복
- 조건이 처음부터 false면 한 번도 실행 안 됨

```java
while (조건식) {
    ...
}
```

---

### ✅ do-while 문

- 조건과 관계없이 **최소 1번은 실행**

```java
do {
    ...
} while (조건식);
```

---

## 🚪 4. break & continue

### ✅ break
- 반복문을 **즉시 종료**

```java
while (true) {
    if (조건) break;
}
```

### ✅ continue
- 아래 코드 무시하고 **다음 반복 진행**

```java
for (int i = 1; i <= 5; i++) {
    if (i % 2 == 0) continue;
    System.out.println(i);  // 홀수만 출력됨
}
```

---

## 💡 5. 무한 루프 예제

```java
while (true) {
    System.out.println("계속 반복");
    if (어떤 조건) break;
}
```

또는
```java
for (;;) {
    ...
}
```

---

## 📌 요약 정리

| 구문 | 설명 |
|------|------|
| `if`, `else if`, `else` | 조건 판단 |
| `switch-case` | 여러 값 중 선택 |
| `for` | 정해진 횟수 반복 |
| `while` | 조건에 따라 반복 |
| `do-while` | 최소 1번 실행되는 반복문 |
| `break` | 반복 종료 |
| `continue` | 반복의 다음 단계로 건너뜀 |
