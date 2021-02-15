public class Flamingo extends Bird {

    // properties 
    double legLength;
	String color;  
	boolean standOnOneLeg = true; 

    // constructor 

    Flamingo(double wingSpan, boolean isEndangered, boolean canPerch, double legLength, string color) {
	  super(wingSpan, isEndangered, canPerch, legLength, color); 
      this.legLength = legLength;
	  this.color = color; 
	  this.standOnOneLeg = standOnOneLeg; 
    }

    // behavior 
    public void standOnOneLeg(boolean standOnOneLeg) {
		if(standOnOneLeg){
			System.out.print("He stands on one leg."); 
		}
		else{
			System.out.println("He does not stand on one leg."); 
		}
	}

	public void legLength(double legLength){
		System.out.println("His legs are " + legLength + " feet long."); 

	}

	public void color(String color){
		System.out.println("He is " + color); 
	}

	public void display() {
		System.out.println(this.name + "is a Flamingo");
	   	standOnOneLeg(standOnOneLeg); 
		legLength(legLength); 	

	}

}
