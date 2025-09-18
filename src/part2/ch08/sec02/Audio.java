package part2.ch08.sec02;

public class Audio implements RemoteControl{

    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio 를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if (volume<RemoteControl.MIN_VOLUME){
            this.volume=RemoteControl.MIN_VOLUME;
        }else {
            this.volume=volume;
        }
        System.out.println("현재 Audio 볼륨 : "+this.volume);
    }

    private  int memoryVolume;

    //디폴트 메소드 재정의
    @Override
    public void setMute(boolean mute){
        if (mute){
            this.memoryVolume=this.volume;
            System.out.println("무음 처리합니다.");
            //추상 메소드 호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);
        }else {
            System.out.println("무음 해제 합니다.");
            setVolume(this.memoryVolume);
        }
    }
}
