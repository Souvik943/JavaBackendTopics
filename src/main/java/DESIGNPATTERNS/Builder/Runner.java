package DESIGNPATTERNS.Builder;

import java.sql.SQLOutput;

public class Runner {
    public static void main(String[] args) {
        Dog dog1 = new Dog.DogBuilder("Pug", "Bruno", 11).setVaccinated(true).build();
        Dog dog2 = new Dog.DogBuilder("Doberman", "Rock", 11).setVaccinated(false).build();

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
    }
}
