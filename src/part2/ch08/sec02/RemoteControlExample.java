package part2.ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        //인터페이스 변수 선언
        RemoteControl rc;

        //television 객체 생성, 인터페이스 변수대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

        //디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        //Audio 객체 생성, 인터페이스 변수대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        //디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        //정적 메소드 호출
        RemoteControl.changeBattery();
    }
}
