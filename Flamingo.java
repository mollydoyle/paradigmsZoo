public class Flamingo extends Bird {

    // properties 
    double legLength;
	String color;  
	boolean standOnOneLeg; 

    // constructor 

    Flamingo(String name, int age, double wingSpan, boolean isEndangered, double legLength, String color) {
	 		super(name, age, wingSpan, isEndangered); 
      this.legLength = legLength;
	  	this.color = color; 
		}
		
		Flamingo(String name, boolean isEndangered) {
			super(name, isEndangered);
		}

    // behavior 
    public void standOnOneLeg() {
			System.out.print("He stands on one leg. "); 
		}

	public void legLength(double legLength){
		System.out.print("His legs are " + legLength + " feet long. "); 
	}

	public void color(String color){
		System.out.print("He is " + color); 
	}

	public void move() {
		System.out.print("He stomps through the water on his long legs. ");
	}

	public void display() {
		System.out.print(this.name + " is a Flamingo. ");
		System.out.print("He is " + this.age + " years old. "); 
		exist();
		move();
	  System.out.print("His wingspan is " + this.wingSpan + " inches long. "); 
		if(this.isEndangered){
			System.out.print("He is endangered. "); 
		} else{
			System.out.print("He is not endangered. "); 
		}
		perch();
		legLength(legLength); 	
		color(color); 
		standOnOneLeg();
		System.out.println("\n");
	}

}
