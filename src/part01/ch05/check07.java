package part01.ch05;


import java.util.Arrays;

public class check07 {
    public static void main(String[] args) {
        /*주어진 배열에서 최대값을 출력하는 코드 작성(for문 사용)*/
        int[] array = {1,5,3,8,2};
        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println("max : "+max);
    }

}
