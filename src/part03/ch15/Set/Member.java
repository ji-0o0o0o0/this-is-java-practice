package part03.ch15.Set;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //hashCode 재정의
    @Override
    public  int hashCode() {
        return name.hashCode()+age;
    }

    //equals 재정의
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return name.equals(target.name) && age == target.age;
        }
        return false;
    }
}
