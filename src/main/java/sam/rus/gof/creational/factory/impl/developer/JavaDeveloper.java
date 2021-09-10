package sam.rus.gof.creational.factory.impl.developer;

import sam.rus.gof.creational.factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write a Java code ...");
    }
}
