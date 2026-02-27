package part03.ch16.check.c7;

public class Example {
    private static int[] scores = {10,50,3};

    public static int maxOrMin(Operator op) {
        int result = scores[0];
        for(int score : scores) {
            result = op.apply(result,score);
        }
        return result;
    }

    public static void main(String[] args) {
        //최대값 얻기
        int max = maxOrMin(Math::max);
        System.out.println(max);

        int min  = maxOrMin(Math::min);
        System.out.println(min);
    }
}
