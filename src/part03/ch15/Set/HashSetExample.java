package part03.ch15.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<Member> set1 =  new HashSet<>();
        set1.add(new Member("홍길동",30));
        set1.add(new Member("홍길동",30)); //-> 동등 객체이므로 객체 1개만 저장

        System.out.println(set1.size());

    }
}
