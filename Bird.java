//Bird class inherits from Animal
public class Bird extends Animal {
    // properties
    double wingSpan;
    boolean isEndangered;
	boolean canPerch; 

    // constructor
    public Bird(double wingSpan, boolean isEndangered, boolean canPerch) {
        this.wingSpan = wingSpan;
        this.isEndangered = isEndangered; 
		this.canPerch = canPerch; 
    }

    // behavior 
    public void canPerch(boolean canPerch) {
		this.canPerch = canPerch; 
	}

	public void isEndangered(boolean isEndangered){
		this.isEndangered = isEndangered; 
	}

	public void wingSpan(double wingSpan){
		this.wingSpan = wingSpan; 
	}

}
