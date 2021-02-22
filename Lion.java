public class Lion extends Mammal {

    // properties 
    double clawLength;

    // constructor
    Lion(String name, int age, boolean isAquatic, double clawLength) {
        super(name, age, isAquatic);
        this.clawLength = clawLength;
    }

    Lion(String name, double clawLength) {
        super(name);
        this.clawLength = clawLength;
    }

    public void specialProperty() {
        System.out.print("Has claws that are " + this.clawLength + "inches long. "); 
      }

    // behavior 
    public void move() {
        System.out.print("He stalks and lunges when he moves. ");
    }

    public void speak() {
        System.out.print("He makes a roar sound. ");
    }

    public void hunt() {
        System.out.print("He hunts his prey for a food source. ");
    }

    public void display() {
        System.out.print(this.name + " is a Lion. "); 
		System.out.print("He is " + this.age + " years old. ");
        exist();
        move();
        if(isAquatic) {
            System.out.print("He is an aquatic mammal. ");
        }
        else {
            System.out.print("He is not an aquatic mammal. ");
        }
        this.speak();
        System.out.print("His claws are " + this.clawLength + "inches long. "); 
        this.hunt();
        System.out.println("\n");
    }
}
