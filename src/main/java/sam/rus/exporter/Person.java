package sam.rus.exporter;


import javax.validation.constraints.NotNull;

public class Person {
    public static String name = "Sam";
    @NotNull
    public String hub;

    public Person() {
       hub = null;
    }

    public void name() {
        System.out.println("hi, my name is " + name);
    }

}