package Practice.AbstractClass;


abstract class Legs{
    void ethanaKaa(){
        System.out.println("Naalu");
    }
    abstract void colour();
}

abstract class Animal extends Legs{
    abstract  void makeSound();
}
abstract class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Barks");
    }
}
class colorfulDog extends Dog{

    @Override
    void colour() {
        System.out.println("Red");
    }
}
abstract class Cat extends Animal{

    @Override
    void makeSound() {
        System.out.println("Mew");
    }
}

class Main{
    public static void main(String[] args) {
        Animal dog= new colorfulDog();
        dog.makeSound();
        Animal oruAnimal=new Animal() {
            @Override
            void colour() {
                System.out.println("Trla");
            }

            @Override
            void makeSound() {
                System.out.println("Yamma Yamma");
            }

            void teriyathaFunction(){
                System.out.println("Ennamo Etho");
            }
        };
        dog.colour();
        oruAnimal.makeSound();

    }
}
