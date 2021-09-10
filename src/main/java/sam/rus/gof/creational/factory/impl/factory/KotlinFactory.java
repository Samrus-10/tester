package sam.rus.gof.creational.factory.impl.factory;

import sam.rus.gof.creational.factory.Developer;
import sam.rus.gof.creational.factory.DeveloperFactory;
import sam.rus.gof.creational.factory.impl.developer.KotlinDeveloper;

public class KotlinFactory implements DeveloperFactory {
    @Override
    public Developer getDeveloper() {
        return new KotlinDeveloper();
    }
}
