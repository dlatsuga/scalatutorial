package udemy._1_oop_1._1_fields._0_varval;

public class Person2J {
    private int age = 1;

    public Person2J() {
    }

    // accessor
    public int age() {
        return age;
    }

    // mutator, '$' special Scala compiler character
    public void age_$eq(int age) {
        this.age = age;
    }
}
