//Mammal class inherits from Animal
public abstract class Mammal extends Animal {

    // properties
    boolean isAquatic;

    // constructor
    protected Mammal(String name, int age, boolean isAquatic) {
        super(name, age);
        this.isAquatic = isAquatic;
    }

    protected Mammal(String name) {
        super(name);
    }

    // behavior 
    public abstract void speak();
}
