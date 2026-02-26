package part03.ch15.Map;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>();

        //작업 스레드 객체 생성
        Thread threadA = new Thread(){
            @Override
            public void run(){
                //객체 1000개 추가
                for(int i = 0; i < 1000; i++){
                   map.put(String.valueOf(i), i);
                }
            }
        };

        //작업 스레드 객체 생성
        Thread threadB = new Thread(){
            @Override
            public void run(){
                for(int i = 1000; i < 2000; i++){
                    map.put(String.valueOf(i), i);
                }
            }
        };

        //작업 스레드 실행
        threadA.start();
        threadB.start();

        //작업 스레드들이 모두 종료될 떄까지 메인 스레드를 기다리게 함
        try {
            threadA.join();
            threadB.join();
        }catch (Exception e){}

        //저장된 총 객체 수 얻기
        int size = map.size();
        System.out.println("총 엔트리 수 : "+size);
    }
}
