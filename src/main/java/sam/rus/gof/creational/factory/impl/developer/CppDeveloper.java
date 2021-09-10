package sam.rus.gof.creational.factory.impl.developer;

import sam.rus.gof.creational.factory.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write a  c++ code ......");
    }
}
