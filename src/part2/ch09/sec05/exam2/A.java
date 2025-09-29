package part2.ch09.sec05.exam2;

public class A {
    //A 인스턴스 필드
    String field = "A-field";

    //A 인스턴스 메소드
    void method(){
        System.out.println("A-method");
    }
    //인스턴스 멤버 클래스
    class B{
        //B인스턴스 필드
        String filed = "B-field";
        //B 인스턴스 메소드
        void method(){
            System.out.println("B-method");
        }

        //B 인스턴스 메소드
        void print(){
            //B객체의 필드와 메소드 사용
            System.out.println(this.filed);
            this.method();

            //A객체의 피드와 메소드 사용
            System.out.println(A.this.field);
            A.this.method();
        }
    }

    //A의 인스턴스 메소드
    void useB(){
        B b = new B();
        b.print();
    }
}
