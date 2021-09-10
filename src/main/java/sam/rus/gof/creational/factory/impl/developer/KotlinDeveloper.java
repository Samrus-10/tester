package sam.rus.gof.creational.factory.impl.developer;

import sam.rus.gof.creational.factory.Developer;

public class KotlinDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write a Kotlin code...");
    }
}
