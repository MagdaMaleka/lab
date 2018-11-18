public class Animals {
    public static void main(String[] args) {

        Animal[] animals = new Animal[6];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Filemon");
        animals[2] = new Pig("Prosiaczek");
        animals[3] = new Horse("Bolek");
        animals[4] = new Parrot("Kaja");
        animals[5] = new Animal();

        for(Animal animal:animals){
            animal.introduce();
        }

    }
}

class Animal {
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String showName() {
        return "zwierze " + name;
    }

    String makeSound(){
        return "??????";
    }

    void introduce(){
        System.out.println("Jestem " + showName() + ": " + makeSound());
    }
}

class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "pies " + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }
}

class Pig extends Animal {
    public Pig(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "swinka";
    }

    @Override
    String makeSound() {
        return "hrum hrum";
    }
}

class Horse extends Animal{
    public Horse(String name) {
        this.name = name;
    }
    @Override
    String showName() {
        return "kon " + name;
    }

    @Override
    String makeSound() {
        return "ihahaha";
    }
}

class Parrot extends Animal{
    public Parrot(String name) {
        this.name = name;
    }
    @Override
    String showName() {
        return "papuga " + name;
    }
    @Override
    String makeSound() {
        return "ćwir ćwir";
    }

}
