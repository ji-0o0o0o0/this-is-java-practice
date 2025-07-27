package part01.ch05;

import java.util.Scanner;

public class check09 {
    public static void main(String[] args) {
        /*
        * 학생 수와 각 학생들의 점수를 입력받고 while문과 scanner의 nextLine() 메소드 이용
        * 최고점수, 평귬점수 출력
        * */
        Scanner sc = new Scanner(System.in);
        int studentCnt = 0;
        int[] scores= null;
        boolean check = true;
        while (check){
            System.out.println("---------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("---------------------------------------------------");
            System.out.print("선택> ");
            String input =sc.nextLine();
            switch (input){
                case "1"->{
                    System.out.print("학생수> " );
                    studentCnt = sc.nextInt();
                    sc.nextLine(); // ← 개행 제거
                    scores = new int[studentCnt];
                }case "2"->{
                    if (scores == null) {
                        System.out.println("먼저 학생 수를 입력하세요.");
                        continue;
                    }
                    for (int i = 0; i <studentCnt ; i++) {
                        System.out.print("scores["+i+"]> ");
                        scores[i]=sc.nextInt();
                        sc.nextLine(); // ← 개행 제거
                    }
                }case "3"->{
                    if (scores == null) {
                        System.out.println("먼저 학생 수를 입력하세요.");
                        continue;
                    }
                    for (int i = 0; i <studentCnt ; i++) {
                        System.out.println("scores["+i+"]: "+scores[i]);
                    }
                }case "4"->{
                    if (scores == null) {
                        System.out.println("먼저 학생 수를 입력하세요.");
                        continue;
                    }
                    int max = scores[0];
                    int sum = 0;
                    for (int i = 0; i <studentCnt ; i++) {
                        if(max<scores[i]){
                            max=scores[i];
                        }
                        sum+=scores[i];
                    }
                    System.out.println("최고 점수 : "+max);
                    System.out.println("평균 점수 : "+(double)sum/studentCnt);
                    //System.out.printf("평균 점수 : %.2f\n", (double)sum/studentCnt);

                }
                case "5"->{
                    System.out.println("프로그램 종료");
                    check=false;
                }
            }
        }
    }
}
