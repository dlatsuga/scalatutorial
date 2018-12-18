package udemy._1_oop_1._1_fields._2_java_bean;

import udemy._1_oop_1._1_fields._0_varval.Reflector;

public class Person2DemoJ {
    public static void main(String[] args) {
        Reflector.reflect(Person2.class);

        Person2 person2 = new Person2(0);

        // scala style
        person2.age_$eq(person2.age() + 5);

        // java style
        person2.setAge(person2.getAge() + 7);
    }
}
