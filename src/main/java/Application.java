/**
 * Created by jamesg on 15/02/2017.
 */
public class Application {

    //See http://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/

    public static void main (String... args){
        User u1 = new User.UserBuilder("James", "Graham").build();

        System.out.println("Basic user object with mandatory fields" + u1);

        User u2 = new User.UserBuilder("James", "Graham").middlename("Craig").build();

        System.out.println("User with optional middle name"+u2);
    }
}
