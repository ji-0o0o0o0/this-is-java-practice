package part03.ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //매개변수가 2개일 경우
        person.action1((name, job) -> {
            System.out.print(name+"이 ");
            System.out.println(job +"을 합니다.");
        });
        person.action1((name, job) -> System.out.printf("%s이 %s을 하지 않습니다.%n",name,job));

        //매개변수가 한 개인 경우
        person.action2((word->{
            System.out.printf("\"%s\"라고 말합니다.%n",word);
        }));
        person.action2((word-> System.out.printf("\"%s\"라고 외칩니다.%n",word)));
    }
}
