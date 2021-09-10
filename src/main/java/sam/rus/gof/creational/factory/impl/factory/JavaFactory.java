package sam.rus.gof.creational.factory.impl.factory;

import sam.rus.gof.creational.factory.Developer;
import sam.rus.gof.creational.factory.DeveloperFactory;
import sam.rus.gof.creational.factory.impl.developer.JavaDeveloper;

public class JavaFactory implements DeveloperFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }
}
