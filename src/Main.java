/**
 * Created by Lenovo on 18.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Dorota", "Kowalska", Gender.WOMEN);
        Person person1 = new Person("Oskar", "Kowalski", Gender.MEN);

        Gender gender = Gender.MEN;

        System.out.println(person1.getGender().isHasMakeup());

    }
}
