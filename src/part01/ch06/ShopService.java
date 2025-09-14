package part01.ch06;

public class ShopService {
    //싱글톤 패턴으로
    //싱글톤 패턴이란 애플리케이션 전체에서 단 한개의 객체만 생성해서 사용하고 싶을 때
    //private 접근 권한을 갖는 정적 필드 선언과 초기화
    private static ShopService shopService = new ShopService();
    //privte 접근 구한을 갖는 생성자 선언
    private ShopService(){};
    //pubic 접근 권한을 갖는 정적 메소드 선언
    public static ShopService getInstance(){
        return shopService;
    }
}
