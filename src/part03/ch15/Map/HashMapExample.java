package part03.ch15.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("신용권",85);
        map.put("홍길동",90);
        map.put("동장군",80);
        map.put("홍길동",95);
        System.out.println("엔트리 수 : "+map.size());
        System.out.println();

        //키로 값 얻기
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key+ " : "+value);
        System.out.println();

        //키 set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String k = it.next();
            Integer v = map.get(k);
            System.out.println(k+" : "+v);
        }
        System.out.println();

        //엔트리 set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k+" : "+v);
        }
        System.out.println();

        //키로 엔트레 삭제
        map.remove("홍길동");
        System.out.println("총 entry 수 : "+ map.size());
    }
}
