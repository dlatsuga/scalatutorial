package udemy._1_oop_1._1_fields._2_java_bean;

import udemy._1_oop_1._1_fields._0_varval.Reflector;

public class Person1DemoJ {
    public static void main(String[] args) {
        Reflector.reflect(Person1.class);

        Person1 person1 = new Person1();

        // scala style
        person1.age_$eq(person1.age() + 7);

        //java style
        person1.setAge(person1.getAge());
    }
}
