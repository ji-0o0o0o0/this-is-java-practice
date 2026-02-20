package part03.ch15.check;

import java.util.HashMap;
import java.util.Map;

public class Check9 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("blue",96);
        map.put("hong",86);
        map.put("white",92);

        String name=null;
        int maxScore=0;
        int totalScore=0;

        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()>maxScore){
                maxScore=entry.getValue();
                name=entry.getKey();
            }
            totalScore+=entry.getValue();
        }

        System.out.printf("평균점수 : %d %n",totalScore/map.size());
        System.out.printf("최고 점수 : %d %n",maxScore);
        System.out.printf("최고 점수 받은 아이디 : %s",name);
    }
}
