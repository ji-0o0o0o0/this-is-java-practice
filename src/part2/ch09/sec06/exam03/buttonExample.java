package part2.ch09.sec06.exam03;

public class buttonExample {
    public static void main(String[] args) {
        //ok 버튼 객체 생성
        Button btnOk = new Button();

        //ok 버튼클릭 이벤트를 처리할 clickListener 구현 클래스(로컬 클래스)
        class OkListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("ok 버튼을 클릭했습니다.");
            }
        }
        //ok 버튼 객체에 clickListener 구현 객체 주입
        btnOk.setClickListener(new OkListener());
        btnOk.click();

        //-----------------------------------------

        //Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        //Cancel 버튼클릭 이벤트를 처리할 clickListener 구현 클래스(로컬 클래스)
        class CancelListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }
        //Cancel 버튼 객체에 clickListener 구현 객체 주입
        btnOk.setClickListener(new CancelListener());
        btnOk.click();
    }
}
