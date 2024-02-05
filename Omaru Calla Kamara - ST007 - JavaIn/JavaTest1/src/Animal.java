public class Animal {

    public void  makeSound() {

        System.out.println("The Animal Makes a Sound");
    }

    public Animal() {
    }
}

class Cat extends Animal {
String name = "Cat";
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("The " + name + " make sound bark ");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
