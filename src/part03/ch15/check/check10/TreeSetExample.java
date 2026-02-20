package part03.ch15.check.check10;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();
        ts.add(new Student("blue",96));
        ts.add(new Student("hong",86));
        ts.add(new Student("white",92));

        Student student = ts.last();
        System.out.printf("최고점수 : %d %n",student.score);
        System.out.printf("촤고 점수 받은 아이디: %s",student.id);
    }
}
