//Bird class inherits from Animal
public abstract class Bird extends Animal {
    // properties
    double wingSpan;
    boolean isEndangered;

    // constructor
    protected Bird(String name, int age, double wingSpan, boolean isEndangered) {
        super(name, age);
        this.wingSpan = wingSpan;
        this.isEndangered = isEndangered; 
    }

    protected Bird(String name, boolean isEndangered) {
        super(name);
        this.isEndangered = isEndangered;
    }

    // behavior 
    public void perch() {
		System.out.print("He can perch on a branch. ");
    }
    
    public void specialProperty(){
        if(this.isEndangered) {
            System.out.print("He is an endangered species. ");
        }
        else {
            System.out.print("He is not an endangered species. ");
        }
    }
}
