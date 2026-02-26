package part03.ch16.sec05.exam02;

import part03.ch16.sec05.exam02.Person;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        //(a,b)->a.compareToIgnoreCase(b)
        //String::compareToIgnoreCase => 메소드 참조
        person.ordering(String::compareToIgnoreCase);
    }
}
