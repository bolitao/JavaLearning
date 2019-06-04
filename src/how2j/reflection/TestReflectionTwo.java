package how2j.reflection;

import how2j.exception.Hero;

import java.lang.reflect.Constructor;

public class TestReflectionTwo {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "teemo";
        System.out.println(hero1);
        try {
            String className = "how2j.exception.Hero";
            Class aClass = Class.forName(className);
            Constructor constructor = aClass.getConstructor();

            // 构造器实例化
            Hero hero2 = (Hero) constructor.newInstance();
            hero2.name = "gareen";
            System.out.println(hero2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
