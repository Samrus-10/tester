package sam.rus.train;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Bean {
    KATE("Kate"), SAM("Sam"), DANY("Dany");
    private String name;
}
