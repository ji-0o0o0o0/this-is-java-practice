package part2.ch07.check.no07;

public class Child  extends Parent{
    public String name;

    public Child() {
        // 여기서 자동으로 super() 생성자 생성됨
        this("홍길동");
        System.out.println("Child() call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
