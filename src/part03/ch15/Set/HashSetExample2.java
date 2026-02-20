package part03.ch15.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();

        //객체 저장
        set.add("JAVA");
        set.add("JDBC");
        set.add("JSP");
        set.add("JAVA");
        set.add("Spring");

        //객체를 하나씩 가져와서 처리
        Iterator<String> iterator = set.iterator();
        while ((iterator.hasNext())){
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("JSP")){
                //가져온 객체를 컬력션에서 제거
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JDBC");

        //객체를 하나씩 가져와서 처리
        for(String element : set){
            System.out.println(element);
        }

    }
}
