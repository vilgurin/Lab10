package builder;

public class MainBuilder {
    public static void main(String[] args) {
        User user = User.builder().userName("Vadym").gender("M").userAge(19).occupation("IT").build();
        System.out.println(user);
    }
}
