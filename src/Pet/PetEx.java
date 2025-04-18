package Pet;

public class PetEx {

    public static void main(String[] args) {

        Dog miguel = new Dog();
        miguel.setColor("brown");
        miguel.talk();
        miguel.walk();

        Fish beta = new Fish();
        beta.setColor("orange");
        beta.swim();
    }
}
