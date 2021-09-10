package sam.rus.train;

import jdk.nashorn.internal.runtime.options.Option;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.Optional;

@Getter
@AllArgsConstructor
public enum Wrapper {
    First(Bean.KATE, "dop"), Second(Bean.DANY, "dop"), Third(Bean.SAM, "dop");
    private Bean fiead;
    private String dop;

    public static Optional<Wrapper> getWrapperByField(Bean fiead) {
        return EnumSet.allOf(Wrapper.class)
                .stream()
                .filter(wrapper ->  wrapper.fiead == fiead )
                .findAny();
    }

    public static Optional<Wrapper> getWrapperByDop(String dop) {
        return EnumSet.allOf(Wrapper.class)
                .stream()
                .filter(wrapper -> wrapper.dop.equalsIgnoreCase(dop))
                .findAny();
    }
}
