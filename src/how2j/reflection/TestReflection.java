package how2j.reflection;

import how2j.exception.Hero;

public class TestReflection {
    public static void main(String[] args) {
        String className = "how2j.exception.Hero";
        Class aClass2 = new Hero().getClass();
        try {
            System.out.println("ddd");
            Class aClass = Class.forName(className);
            Class aClass1 = Hero.class;

            System.out.println("getClass() toString(): " + new Hero().getClass());
            System.out.println(className);
            System.out.println(aClass == aClass1);
            System.out.println(aClass == aClass2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
