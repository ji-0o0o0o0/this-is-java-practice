package part03.ch16.check.c8;

public class Example {
    private static Student[] students={
            new Student("홍길동",90,96),
            new Student("신영권",95,93)

    };

    //avg 메소드
    public static double avg(Function<Student> function){
        int sum = 0;
        for(Student s:students){
            sum+=function.apply(s);
        }
        return (double) sum/students.length;
    }

    public static void main(String[] args) {
        double engAvg = avg(Student::getEngScore);
        System.out.println("영어 평균 점수 : "+engAvg);

        double mathAvg = avg(s-> s.getMathScore());
        System.out.println("영어 평균 점수 : "+mathAvg);
    }
}
