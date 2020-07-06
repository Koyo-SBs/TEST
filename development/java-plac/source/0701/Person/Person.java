public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(){
        this("John Doe",25);
    }

    void introduce() {
        System.out.println("My name is " + name + ".");
        System.out.println("I'm " + age + " years old.");
    }
}