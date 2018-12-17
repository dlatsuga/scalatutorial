package udemy._1_oop_1._1_fields._0_varval;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflector {
    public static void reflect(Class clazz){
        System.out.println("***************** Name ******************");
        String simpleName = clazz.getSimpleName();
        System.out.println(simpleName);
        System.out.println();

        System.out.println("***************** Constructors ******************");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println();

        System.out.println("***************** Fields ******************");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println();

        System.out.println("***************** Methods ******************");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }
}
