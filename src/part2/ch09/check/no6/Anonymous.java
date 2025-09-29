package part2.ch09.check.no6;

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
