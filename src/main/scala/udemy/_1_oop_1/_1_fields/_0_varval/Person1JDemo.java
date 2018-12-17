package udemy._1_oop_1._1_fields._0_varval;

public class Person1JDemo {
    public static void main(String[] args) {
        Reflector.reflect(Person1.class);

        Person1 person1 = new Person1();
        // accessor == getter
        int age = person1.age();
    }
}
