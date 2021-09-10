package sam.rus.gof.creational.factory;

import sam.rus.gof.creational.factory.impl.factory.MainFactory;

public class Main {
    public static void main(String[] args) {
        Developer cpp = MainFactory.getDeveloper("cpp");
        Developer java = MainFactory.getDeveloper("Java");
        Developer kotlin = MainFactory.getDeveloper("kotlin");

        cpp.writeCode();
        java.writeCode();
        kotlin.writeCode();

        MainFactory.getDeveloper("c#");
    }
}
