package sam.rus;

import sam.rus.exporter.Person;
import sam.rus.train.Bean;
import sam.rus.train.Wrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Wrapper wrapper = Wrapper.getWrapperByDop(null).orElse(null);
        String result  =  Objects.nonNull(wrapper) ? wrapper.getFiead().getName() : null;
        System.out.println(result);
    }
}
