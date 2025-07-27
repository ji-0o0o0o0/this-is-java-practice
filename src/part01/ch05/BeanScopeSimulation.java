package part01.ch05;

public class BeanScopeSimulation {
    public static void main(String[] args) {
        System.out.println("=== 싱글톤 Bean 요청 ===");
        SingletonBean s1 = SingletonBean.getInstance();
        SingletonBean s2 = SingletonBean.getInstance();
        System.out.println("같은 객체인가? " + (s1 == s2));

        System.out.println("\n=== 프로토타입 Bean 요청 ===");
        PrototypeBean p1 = new PrototypeBean();
        PrototypeBean p2 = new PrototypeBean();
        System.out.println("같은 객체인가? " + (p1 == p2));
    }
}

class SingletonBean {
    private static final SingletonBean instance = new SingletonBean();

    private SingletonBean() {
        System.out.println("🔵 SingletonBean 생성됨");
    }

    public static SingletonBean getInstance() {
        return instance;
    }
}

class PrototypeBean {
    public PrototypeBean() {
        System.out.println("🟠 PrototypeBean 생성됨");
    }
}