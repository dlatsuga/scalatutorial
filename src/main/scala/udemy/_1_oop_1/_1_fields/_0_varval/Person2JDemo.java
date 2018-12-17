package udemy._1_oop_1._1_fields._0_varval;

public class Person2JDemo {
    public static void main(String[] args) {
        Reflector.reflect(Person2.class);

        Person2 person2 = new Person2();

        //accessor == getter
        person2.age();

        //mutator == setter
        person2.age_$eq(2);
    }
}
