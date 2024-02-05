public class Main {





    public static void main(String[] args) {

        Animal cat = new Cat();
//        Cat cat = new Cat();
        AnimalFamily bird = new Bird();
        Cat2 cat2 = new Cat2();

        cat.makeSound();
        bird.sound();
        cat2.sound();

    }

    public static void makingSound(AnimalFamily animalFamily) {
//animalFamily.sound();

    }
}