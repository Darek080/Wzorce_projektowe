import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private final String name;
    private final String lastName;
    private final Gender gender;
    private final Adress adress;
    private final int age;
    private Person(String name, String lastName, Gender gender, Adress adress, int age) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.adress = adress;
        this.age = age;
    }
    public static Builder builder() {
        return new Builder();
    }
    public static Person man(String firstName, String lastName, Adress adress, int age) {
        return new Builder()
                .firstName(firstName)
                .lastName(lastName)
                .gender(Gender.MALE)
                .adress(adress)
                .age(age)
                .build();
    }
    public static Person woman(String firstName, String lastName, Adress adress, int age) {
        return new Builder()
                .firstName(firstName)
                .lastName(lastName)
                .gender(Gender.FEMALE)
                .adress(adress)
                .age(age)
                .build();
    }
    public static class Builder {
        private String name;
        private String lastName;
        private Gender gender;
        private Adress adress;
        private int age;
        public Person build() {
            return new Person(name, lastName, gender, adress, age);
        }
        public Builder firstName(String name) {
            this.name = name;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }
        public Builder adress(Adress adress) {
            this.adress = adress;
            return this;
        }
        public Adress.Builder adressBuilder() {
            return Adress.builder();
        }
    }
}