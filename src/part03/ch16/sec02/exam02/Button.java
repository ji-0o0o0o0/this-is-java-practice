package part03.ch16.sec02.exam02;

public class Button {
    //정적 멤버 인터페이스
    public static interface ClickListener {
        //추상 메소드
        void onClick();
    }//=> 함수형 인터페이스

    //필드
    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }

}
