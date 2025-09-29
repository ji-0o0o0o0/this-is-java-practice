package part2.ch09.sec02.exam01;

public class AExample {
    public static void main(String[] args) {
        //A객체 생성
        A a = new A();

        //B 객체 생성
        /*A.B b = a.new B();*/

        //A 인스턴스 메소드 호출
        a.useB();
    }
}
