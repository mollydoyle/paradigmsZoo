public class Crocodile extends Reptile {

    // properties 
	double tailLength; 
	String nameOfSwamp; 
    boolean isDangerous;


    // constructor
    Crocodile (double speed, string favoriteFood, double tailLength, String nameOfSwamp, boolean isDangerous) {
		super(speed, favoriteFood, tailLength, nameOfSwamp, isDangerous); 
    	this.tailLength = tailLength; 
		this.nameOfSwamp = nameOfSwamp; 
		this.isDangerous = isDangerous;
    }


	public void isDangerous(boolean isDangerous){
		if(isDangerous){
			System.out.println("He is dangerous."); 
		}
		else{
			System.out.println("He is not dangerous."); 
		}
	}

	public void tailLength(double tailLength){
		System.out.println("His tail is " + tailLength + " feet long."); 
	}

	public void nameOfSwamp(String nameOfSwamp){
		System.out.println("He lives in " + nameOfSwamp + " swamp."); 
	} 

    public void display() {
		System.out.println(this.name + " is a Crocodile."); 
		System.out.println("He is " + this.age + " years old."); 
		System.out.println("He moves at a rate of " + this.speed + " miles per hour."); 
		System.out.println("His favorite food is " + this.favoriteFood + "."); 
		isDangerous(isDangerous); 
		tailLength(tailLength); 
		nameOfSwamp(nameOfSwamp); 
	
	}

}
