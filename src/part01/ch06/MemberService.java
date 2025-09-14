package part01.ch06;

public class MemberService {
    boolean login(String id, String password){
        //id=hong, password=12345 일 경우에 true로 리턴
        return (id.equals("hong")&&password.equals("12345"));
    }
    void logout(String id){
        System.out.println(id+"님이 로그아웃 되었습니다.");
    }
}
