//Mammal class inherits from Animal
public abstract class Mammal extends Animal {

    // properties
    boolean isAquatic;

    // constructor
    public Mammal(String name, int age, boolean isAquatic) {
        super(name, age);
        this.isAquatic = isAquatic;
    }

    // behavior 
    public abstract void speak();
}
