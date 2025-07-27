package part01.ch05;

public class check08 {
    public static void main(String[] args) {
        /*주어진 배열 항목의 전체합과 평균을  구해서 출력(중복 for문 이용)*/
        int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                sum+=array[i][j];
                cnt++;
            }
        }
        System.out.println("총합: "+sum+" 평균 : "+sum/(cnt));
    }
}
