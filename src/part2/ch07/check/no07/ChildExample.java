package part2.ch07.check.no07;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        // 실행 순서 예측
        // this()는 같은 클래스의 다른 생성자를 호출할 때 사용한다.
        //1. child() 생성자에 맨 처음에 자동으로 super() 생성자 생성되므로 부모 생성자를 먼저 방문하게된다.

        //Parent(String nation) call
        //Parent() call
        //Child(String name) call
        //Child() call
    }
}
