public class Person {
    
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {
        System.out.println(age + " years old " + name + " is moving.");
    }

    public void talk() {
        System.out.println(age + " years old " + name + " is talking.");
    }
}
