package how2j.reflection;

import how2j.exception.Hero;

import java.io.File;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Constructor;

public class ConfigTester {
    public static void main(String[] args) {
        Hero hero = getHero();
        System.out.println(hero);
    }

    public static Hero getHero() {
        File file = new File("H:\\Desktop\\hero.config");
        try (FileReader fileReader = new FileReader(file)) {
            String className = null;
            char[] all = new char[(int) file.length()];
            fileReader.read(all);
            className = new String(all);
            Class aClass = Class.forName(className);
            Constructor constructor = aClass.getConstructor();
            Hero hero = (Hero) constructor.newInstance();
            return hero;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
