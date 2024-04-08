import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortPeople {
    public static void main(String[] args) {
        Person[] people = {
                // Tilføj flere personer, som deler nogle af de samme egenskaber f.eks. samme fornavn, men hvor deres andre egenskaber er unikke.
                new Person("Hans", "Filipson", 30, 1.70),
                new Person("Merete", "Poulsen", 12, 1.22),
                new Person("Ibsen", "Poulsen", 55, 1.20),
                new Person("Hans", "Poulsen", 25, 1.89),
                new Person("Mads", "Aaris", 12, 1.22),
                new Person("Sixten", "Poulsen", 15, 1.90)
        };

        System.out.println("Usorteret liste af personer:");
        for (Person person : people) {
            System.out.println(person);
        }

        Arrays.sort(people);
        System.out.println("sorteret liste af personer:");
        for (Person person : people) {
            System.out.println(person);
        }

        Arrays.sort(people, new SortClass());

        System.out.println("sorteret liste af personer by last name:");
        for (Person person : people) {
            System.out.println(person);
        }

    }


}
