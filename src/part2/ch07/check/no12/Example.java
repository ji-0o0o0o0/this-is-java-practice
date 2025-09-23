package part2.ch07.check.no12;

public class Example {
    public static void action(A a){
        a.method1();
        // action 매개값이 C 일 경우에 method2() 실행 되도록
        if(a instanceof C c) {
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }
}
