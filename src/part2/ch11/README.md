## 예외처리
- 예외
    - 일반 예외(Exception)
        - 컴파일러가 예외 처리 코드 여부를 검사하는 예외
    - 실행 예외(Runtime Exeption)
        - 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외
    - 모든 에러와 예외 클래스는 Throwable을 상속방아 만들어지고, 추가적으로 예외 클래스는 java.lang.Exception 클래스를 상속 받음

        <img width="506" height="291" alt="Image" src="https://github.com/user-attachments/assets/602f6f98-e8cc-43c8-833d-01822d824328" />


- 예외 처리 코드

  > 예외 발생 시 프로그램의 갑작스러운 종료를 막고 정상 실행을 유지할 수 있도록 처리하는 코드
  >
    - `try-catch-finally` 블록으로 구성

    <img width="380" height="323" alt="Image" src="https://github.com/user-attachments/assets/9c1e9aef-0e38-4233-8a26-3587ecda1631" />

    - 예외 정보를 얻는 3가지 방법
        - System.out.println(`e.getMessage()`);
            - 예외가 발생한 이유만 리턴
        - System.out.println(`e.toString()`);
            - 예외가 발생한 이유 + 예외의 종류
        - `e.printStackTrace()`;
            - 예외가 발생한 이유 + 예외의 종류+예외가 어디서 발생했는지
    - `Class.forName(”패키지…클래스”)`
        - ClassPath 위치이서 주어진 클래스를 찾는 코드
        - 찾지 못했을 경우 ClassNotFoundException 발생

- 예외 종류에 따른 처리
    - 다중 catch를 사용하여 발생하는 예외에 따라 예외 처리 코드 다르게 작성
    - 예외 클래스들이 상속 관계에 있을 경우
        - 하위 클래스 catch 블록을 먼저 작성 하고 상위 클래스 catch 작성

          → catch 블록은 위에서부터 차례대로 검사 대상

    - 2개 이상 예외를 하나의 catch 블록으로 처리하고 싶을 경우
        - | 을 사용하여 연결

- 리소스 자동 닫기
    - 리소스 : 데이터를 제공하는 객체
        - 리소스를 사용하기 위해 열고, 사용 후 닫아야 한다.
        - → 사용하다가 예외발생 시 안전하게 닫는 것 중요
          (그렇지 않으면 불안정한 상태로 남아있음)
    1. finally 에 닫는 코드 작성
    2. try-with-resourse

        ```java
        try(FileInputStream fis = new FileInputStream("file.txt"){
        	...
        } catch(IOException e){
        	...
        }
        ```

        - try괄호에 리소스 여는 코드 작성하면 try 블록이 정상적으로 실행을 완료 및 예외 발생시 자동으로 리소스 clase() 메소드 호출
        - 사용조건
            1. java.lang.AutoCloseable 인터페이스 구현해서 close() 메소드 재정의 해야한다.

            ```java
            public class FileInputStream implements AutoCloseable{
            	...
            	@Override
            	public void close() throws Exception {...}
            }
            ```

    - 복수 리소스 사용
        - try() 괄호 안에 세미클론(;)으로 구분해서 리소스를 여는 코드 작성하면됨
    - java 9 이후부터 외부 리소스 변수 사용 가능

- 예외 떠넘기기
    - try-catch 로 예외 처리하는 것이 기본이지만, `throws` 로 메소드를 호출한 곳으로 예외를 넘길 수 있다.

    ```java
    public void method1(){
    	try{
    		method2();
    	}catch(ClassNotFoundException e){ //-> 여기서 예외처리
    		System.out.println("예외처리:"+e.getMessage());
    	}
    }
    
    public void method2() throws ClassNotFoundException{
    	Class.forName("java.lang.String2");
    }
    ```

    - 나열해야할 예외 클래스가 많을 경우
        - `throws Exception` 또는 `throws Theowable`
    - main() 메소드 예외처리
        - throws 키워드를 사용해서 예외 넘길 수 있는데 JVM이 콘솔에 출력하는 것으로 예외처리한다.

- 사용자 정의 예외

    ```java
    public class XXXException extends [Exception|RuntimeExpception] {
    	public XXXException(){//기본 생성자
    	}
    	public XXXException(String message){//예외 메시지를 입력받는 생성자
    		super(message);
    		//-> 예외 객체의 공통 메소드인 getMessage()의 리턴값으로 사용하기 위해서
    	}
    }
    ```

    - 예외발생시키기
        - throw된 예외는 catch로 잡거나, 호출한 곳에서 예외를 처리하도록 throws키워드로 예외를 떠넘긴다.
            - throw : 예외 발생
            - throws : 예외 떠넘기기

    - 확인문제
        1. 예외에 대한 설명 중 틀린 것은?
            1. 4. 그 외도 가능
        2. try-catch-finally 블록에 대한 설명 중 틀린 것은
            1. 3. finally는 반드시 마지막에 실행
        3. thorows 에 대한 설명으로 틀린 것은?
            1. 4. throws 는 메소드 선언부 끝에 작성되어 메소드에서 처리하지 않은 예외를 호출한 곳으로 떠넘기는 역할을 한다.throw 는 강제적으로 예외를 발생시켜주는 역할을 한다
        4. throw에 대한 설명으로 틀린것은?
            1. 2. throws 에 대한 설명
        5. 잘못된 예외처리는?
            1. 3. 상속관계일 경우 부모 예외 클래스가 나중에 나와야함
        6. 다음 코드가 실행되었을때 출력 결과

            ```java
            10
            숫자로 변환할 수 없음
            10
            인덱스를 초과했음
            10
            ```