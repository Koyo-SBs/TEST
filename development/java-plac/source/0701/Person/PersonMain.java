
public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Tom", 19);
        Person p2 = new Person("Bob", 21);
        Person p3 = new Person("John", 25);

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}