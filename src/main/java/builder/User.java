package builder;

import java.util.List;
import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

@Builder @ToString
public class User {
    private String userName;
    private int userAge;
    private String gender;
    @Singular
    private List<String> occupations;

}
