//Bird class inherits from Animal
public abstract class Bird extends Animal {
    // properties
    double wingSpan;
    boolean isEndangered;

    // constructor
    public Bird(String name, int age, double wingSpan, boolean isEndangered) {
        super(name, age);
        this.wingSpan = wingSpan;
        this.isEndangered = isEndangered; 
    }

    // behavior 
    public void perch() {
		System.out.print("He can perch on a branch. ");
	}
}
