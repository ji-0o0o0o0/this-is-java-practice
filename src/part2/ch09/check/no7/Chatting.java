package part2.ch09.check.no7;

public class Chatting {
    class Chat{
        void start(){};
        void sendMessage(String message){};
    }

    void startChat(String chatId){
        String nickName=null;
        nickName=chatId;

        Chat chat = new Chat(){
            @Override
            public void start(){
                while (true){
                    String inputDate = "안녕하세요";
                    //String message = "["+nickName+"]"+inputDate;
                    // 로컬변수와 매개변수는 final 특성을 갖고 있어 값 변경 불가능
                    // 변수 'nickName'은 내부 클래스 내에서 액세스되며 최종이거나 효과적으로 최종이어야 합니다.
                    String message = "["+"nickName"+"]"+inputDate;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
}
