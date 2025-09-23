package part2.ch07.check.no08;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.run();
        tire.run();
        //스노우 타이어가 굴러갑니다
        //스노우 타이어가 굴러갑니다
        //-> 자식 클래스에서 오버라이딩된 메소드가 있다면 부모 메소드 대신 오버라이딩된 메소드 호출
    }
}
