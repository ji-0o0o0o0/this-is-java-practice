## 중첩 선언과 익명 객체 
- 중첩 클래스

  > 클래스가 여러 클래스와 관계를 맺는 경우에는 독립적으로 선언하는 것이 좋으나, 특정 클래스만 관계를 맺을 경우에는 중첩 클래스로 선언하는 것이 유지보수에 도움이 되는 경우가 많다.
  >
    - 중첩 클래스 = 클래스 내부에 선언한 클래스
    - 장점
        - 클래스의 멤버를 쉽게 사용할 수 있다
        - 외부에는 중첩 관계 클래스를 감춤→코드의 복잡성을 줄일 수 있다.
    - 분류(선언하는 위치에 따라)
        - 멤버 클래스(클래스 멤버로서 선언되는 중첩 클래스)
            - 인스턴스 / 정적 멤버 클래스로 나뉨
        - 로컬 클래스(메소드 내부에서 선언되는 중첩 클래스)
    - 중첩클래스도 컴파일 하면 바이트 코드 파일 별도 생성

      <img width="297" height="100" alt="Image" src="https://github.com/user-attachments/assets/9131e572-7884-4ca8-9760-724f4a830f7f" />


- 인스턴스 멤버 클래스

    ```java
    [public] class A{
    	[public | private] class B {  //=> 인스턴스 멤버 클래스
    	}
    }
    ```

    - `public class B {}` :  다른 패키지에서 B 클래스를 사용할 수 있다.
    - `class B {}` : 같은 패키지에서만 B 클래스를 사용할 수 있다.
    - `private class B {}` : A 클래스 내부에서만 B 클래스를 사용할 수 있다.
        - → private 가 일반적이다.
    - B 객체를 A 클래스 외부에 생성하려면 default 또는 public 접근 제한을 가져야하고, A 객체를 먼저 생성 후 B 객체를 생성해야 한다.

        ```java
        A a = new A();
        A.B b = a.new B();
        ```

    - B 내부에는 필드, 생성자, 메소드선언 가능
        - 정적 필드, 정적 메소드는 java 17부터 선언 가능

- 정적 멤버 클래스

    ```java
    [public] class A{
    	[public|private] static class B { // -> 정적 멤버 클래스
    	}
    }
    ```

    - 정적 멤버 클래스는 default 또는 public 접근 제한이 일반적
    - A 클래스 외부에서 B 객체 생성 시 A 객체 생성 없이 A 클래스 접근해서 B 클래스 생성
        - `A.B b = new A.B();`
    - 정적 멤버 클래스  B는 필드, 생성자, 메소드 선언 가능

- 로컬 클래스
    - 생성자 또는 메소드 내부에서 선언된 클래스

    ```java
    [public] class A {
    	//생성자
    	public A(){
    		class B{} // -> 로컬 클래스
    	}
    	
    	//메소드
    	public void method(){
    		class B{}// -> 로컬 클래스
    	}
    }
    ```

    - 로컬 클래스는 생성자와 메소드가 실행될 동안에만 객체를 생성 가능
    - 로컬 변수를 로컬 클래스에서 사용할 경우 로컬 변수는 final 특성을 갖게됨
        - → 로컬 클래스 내부에서 값을 변경하지 못하도록 제한하기 때문

- 바깥 멤버 접근
    - 중첩 클래스는 바깥 클래스와 긴밀한 관계를 맺으면서 클래스의 멤버(필드, 메소드)에 접근할 수 있다.
    - 바깥 클래스의 멤버 접근 제한
        - 인스턴스 멤버 클래스
            - 바깥 클래스의 모든 필드와 메소드
        - 정적 멤버 클래스
            - 바깥 클래스의 정적 필드와 정적 메소드
            - 정적 멤버 클래스는 바깥 객체가 없어도 사용가능해야하므로

              → 바깥 클래스의 인스턴스 필드와 인스턴스 메소드 사용 못함

    - 바깥 클래스의 객체 접근
        - 중첩 클래스 내부에서 this는 해당 중첩 클래스의 객체 말함
        - 만약 중첩 클래스 내부에서 바깥 클래스의 객체를 얻으려면 바깥 클래스 이름에 this 붙여주면 됨
            - `바깥클래스이름.this → 바깥객체`

- 중첩 인터페이스

  > 클래스의 멤버로 선언된 인터페이스
  → 해당 클래스와 긴밀한 관계를 맺는 구현 객체를 만들기 위해서
  >
    - 안드로이드와 같은 ui 프로그램에서 이벤트를 처리할 목적으로 많이 쓰임
        - 버튼 클릭시 이벤트 처리할 객체는 중첩 인터페이스

    ```java
    class A {
    	[public|private] [static] interface B{ //-> 중첩 인터페이스
    		//상수필드
    		//추상 메소드
    		//디폴드 메소드
    		//정적 메소드 
    	}
    }
    ```


- 익명 객체

  > 이름이 없는 객체
  >
    - 장점 : 명시적으로 클래스를 선언하지 않기 때문에 쉽게 객체를 생성할 수 있다.
    - 필드값, 로컬 변수값, 매개변수값으로 주로 사용
    - 클래스를 상속하거나 인터페이스를 구현해야만 생성 가능
        - `익명 자식 객체`  : 클래스를 상속해서 만들 경우(`package part2.ch09.sec07.exam01`)

            ```java
            new 부모생성자(매개값,...){
            	//필드
            	//메소드 
            	//-> 위의 필드와 메소드는 중괄호 블록 안에서만 사용가능
            	//왜냐 익명 자식 객체는 부모 타입에 대입되므로 부모 타입에 선언된 멤버만 접근 가능하기에
            	//여기 안에는 부모 메소드를 재정의하는 코드 옴
            }
            ```

        - `익명 구현 객체`:인터페이스를 구현해서 만들 경우(`package part2.ch09.sec07.exam02`)


- 확인 문제
    1. 중첩 멤버 클래스에 대한 설명으로 틀린것은?
        1. 4
    2. 로컬 클래스에 대한 설명으로 틀린것은
        1. 3. static을 통해서 로컬 클래스를 정적 클래스 만들 수 없음
    3. 익명 객체에 대한 설명으로 틀린것은?
        1. 3
    4. Tire와 Engine 객체를 생성하는 코드를 작상해보세요

        ```java
        public class Car {
        	class Tire {}
        	static class Engine{}
        }
        ```

        ```java
        public class CarExample{
        	public static void main(String[] args){
        		Car myCar = new Car();
        		Car.Tire tire = myCar.new Tire();
        		Car.Engine engine = new Car.Engine();
        ```

    5. Action 인터페이스는 다음과 같이 work() 추상 메소드를 갖고 있다. ActionExample클래스의 main() 메소드에서 Action의 익명 구현 객체를 만들어 실행 결과와 동일하게 나오도록 박스 안에 들어갈 코드를 작성하세요

        ```java
        public interface Action{
        	public void work();
        }
        ```

        ```java
        public class ActionExample {
            public static void main(String[] args) {
                Action action = new Action() {
                    @Override
                    public void work() {
                        System.out.println("복사를 합니다.");
                    }
                };
                action.work();
            }
        }
        ```

    6. AnonymousExample 클래스의 실행 결과를 보고, Vehicle 인터페이스의 익명 구현 객체를 필드와 로컬변수 그리고 메소드의 매개값으로 대입해보세요

        ```java
        public interface Vehicle {
            public void run();
        }
        ```

        ```java
        public class Anonymous {
            /*익명 구현 객체*/
            //필드
            Vehicle field = new Vehicle() {
                @Override
                public void run() {
                    System.out.println("자전거가 달립니다");
                }
            };
        
            //로컬 변수의 초기값
            void method1(){
                Vehicle localVar = new Vehicle() {
                    @Override
                    public void run() {
                        System.out.println("승용차가 달립니다");
                    }
                };
                localVar.run();
            }
            //메소드의 매개값
            void method2(Vehicle v){
                v.run();
            }
        }
        ```

        ```java
        public class AnonymousExample {
            public static void main(String[] args) {
                Anonymous anonymous = new Anonymous();
        
                //필드
                anonymous.field.run();
        
                //로컬
                anonymous.method1();
                anonymous.method2(new Vehicle() {
                    @Override
                    public void run() {
                        System.out.println("트럭이 달립니다");
                    }
                });
            }
        }
        ```

    7. 다음 Chatting 클래스에서 컴파일 에러가 나는 원인
        1. 익명 객체 사용시 로컬변수, 매개변수 final 특성을 갖고 있어 변경 불가
