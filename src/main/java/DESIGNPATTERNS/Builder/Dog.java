package DESIGNPATTERNS.Builder;

public class Dog {
    //Mandatory fields
    private final String breed;
    private final String name;
    private final int age;

    //Optional fields
    private final boolean isVaccinated;

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isVaccinated=" + isVaccinated +
                '}';
    }

    public Dog(DogBuilder dogBuilder) {
        this.breed = dogBuilder.breed;
        this.name = dogBuilder.name;
        this.age = dogBuilder.age;
        this.isVaccinated = dogBuilder.isVaccinated;
    }

    public static class DogBuilder {
        //Mandatory fields
        private String breed;
        private String name;
        private int age;

        //Optional fields
        private boolean isVaccinated;

        public DogBuilder(String breed, String name, int age) {
            this.breed = breed;
            this.name = name;
            this.age = age;
        }

        public DogBuilder setVaccinated(boolean vaccinated) {
            isVaccinated = vaccinated;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }
}
