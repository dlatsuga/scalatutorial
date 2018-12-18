package udemy._1_oop_1._1_fields._2_java_bean;

import udemy._1_oop_1._1_fields._0_varval.Reflector;

public class Person0DemoJ {
    public static void main(String[] args) {
        Reflector.reflect(Person0.class);

        Person0 person0 = new Person0();

        person0.setAge(person0.getAge() + 1);
    }
}
