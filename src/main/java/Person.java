import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString(exclude = "random")
public class Person {
    private Random random = new Random();
    private String firstName = getRandomFirstName();
    private String lastName = getRandomLastName();
    private int age = getRandomAge();

    Person() {
    }


    private String getRandomFirstName() {
        return "Taras" + random.nextInt(10);
    }

    private String getRandomLastName() {
        return "Moisiuk" + random.nextInt(10);
    }

    private int getRandomAge() {
        return 18 + random.nextInt(5);
    }
}


