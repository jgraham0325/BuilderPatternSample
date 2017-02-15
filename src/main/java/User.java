import java.util.Date;

/**
 * Created by jamesg on 15/02/2017.
 */
public class User {
    private final String firstName;
    private final String middleName;
    private final String surname;
    private final Date birthday;
    private final EyeColour eyecolour;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public EyeColour getEyecolour() {
        return eyecolour;
    }

    private User(UserBuilder userbuilder) {
        this.firstName = userbuilder.firstName;
        this.middleName = userbuilder.middleName;
        this.surname = userbuilder.surname;
        this.birthday = userbuilder.birthday;
        this.eyecolour = userbuilder.eyecolour;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", eyecolour=" + eyecolour +
                '}';
    }

    public static class UserBuilder{

        private final String firstName;
        private String middleName;
        private final String surname;
        private Date birthday;
        private EyeColour eyecolour;

        public UserBuilder(String firstName, String surname) {
            this.firstName = firstName;
            this.surname = surname;
        }

        public UserBuilder middlename(String middlename){
            this.middleName = middlename;
            return this;
        }
        public UserBuilder birthday(Date birthday){
            this.birthday = birthday;
            return this;
        }
        public UserBuilder eyecolour(EyeColour eyecolour){
            this.eyecolour = eyecolour;
            return this;
        }

        public User build(){
            User user = new User(this);
            validateUserObject(user);
            return user;

        }

        private void validateUserObject(User user) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
    }
}
