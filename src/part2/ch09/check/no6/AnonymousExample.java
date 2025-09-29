package part2.ch09.check.no6;

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
