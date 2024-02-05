public class AnimalFamily {


    public AnimalFamily() {
    }

    public void sound() {

        System.out.println("The sound is: ");
    }
}

class Bird extends AnimalFamily {

String name = "Bird";
    @Override
    public void sound() {
        super.sound();
        System.out.println("The " + name + " makes sound twich twich");
    }
}


class Cat2 extends AnimalFamily {
String name = "Cat2";
    @Override
    public void sound() {
        super.sound();
        System.out.println("The " + name + " makes sound Mwee Mwee");
    }
}