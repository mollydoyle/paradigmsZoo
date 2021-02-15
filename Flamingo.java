public class Flamingo extends Bird {

    // properties 
    double legLength;
	String color;  
	boolean standOnOneLeg; 

    // constructor 

    Flamingo(double wingSpan, boolean isEndangered, boolean canPerch, double legLength, String color, boolean standOnOneLeg) {
	  super(wingSpan, isEndangered, canPerch, legLength, color, standOnOneLeg); 
      this.legLength = legLength;
	  this.color = color; 
	  this.standOnOneLeg = standOnOneLeg; 
    }

    // behavior 
    public void standOnOneLeg(boolean standOnOneLeg) {
		if(standOnOneLeg){
			System.out.println("He stands on one leg."); 
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
		System.out.println(this.name + " is a Flamingo");
		System.out.println("He is " + this.age + " years old."); 
	   	System.out.println("His wingspan is " + this.wingspan + " inches long."); 
		
		if(this.isEndangered){
			System.out.println("He is endangered."); 
		} else{
			System.out.println("He is not endangered."); 
		}

		if(this.canPerch){
			System.out.println("He can perch."); 
		} else{
			System.out.println("He cannot perch."); 
		}


		standOnOneLeg(standOnOneLeg); 
		legLength(legLength); 	
		color(color); 

	}

}
