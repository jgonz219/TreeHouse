package inheritance;

public class Inheritance_Basic {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}

class Animal {
    String sound = "";

    public void makeSound() {
        System.out.println(sound);
    }
}

class Dog extends Animal {
    public Dog() {
        sound = "bark";
    }

}