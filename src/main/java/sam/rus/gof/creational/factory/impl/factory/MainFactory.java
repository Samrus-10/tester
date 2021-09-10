package sam.rus.gof.creational.factory.impl.factory;

import sam.rus.gof.creational.factory.Developer;
import sam.rus.gof.creational.factory.DeveloperFactory;

public class MainFactory {
    private static DeveloperFactory factory;

    public static Developer getDeveloper(String special) {
        if (special.equalsIgnoreCase("cpp")) {
            factory = new CppFactory();
        } else if (special.equalsIgnoreCase("java")) {
            factory = new JavaFactory();
        } else if (special.equalsIgnoreCase("kotlin")) {
            factory = new KotlinFactory();
        }else{
            throw new RuntimeException(special + " do not know.");
        }
        return factory.getDeveloper();
    }
}
