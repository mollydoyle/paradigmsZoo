public class Crocodile extends Reptile {

    // properties 
	double tailLength; 
	String nameOfSwamp; 
    boolean isDangerous;


    // constructor
    Crocodile (String name, int age, double speed, double tailLength, String nameOfSwamp, boolean isDangerous) {
			super(name, age, speed); 
    	this.tailLength = tailLength; 
			this.nameOfSwamp = nameOfSwamp; 
			this.isDangerous = isDangerous;
		}
		
		Crocodile (String name, double tailLength) {
			super(name);
			this.tailLength = tailLength;
		}

		public void specialProperty() {
			System.out.print("has a tail that is " + tailLength + " feet long. "); 
		}

	public void move(){
		System.out.print("He slides on his belly to move. ");
	}

	public void isDangerous(boolean isDangerous){
		if(isDangerous){
			System.out.print("He is dangerous. "); 
		}
		else{
			System.out.print("He is not dangerous. "); 
		}
	}

	public void favoriteFood(){
		System.out.print("His favorite food is fish. ");
	}

	public void deathRoll(){
		System.out.print("He uses the death roll to dismember prey. ");
	}

	// these behaviors are included for dispaly purposes and will not be included as behaviors in the flow chart
	public void tailLength(double tailLength){
		System.out.print("His tail is " + tailLength + " feet long. "); 
	}

	public void nameOfSwamp(String nameOfSwamp){
		System.out.print("He lives in " + nameOfSwamp + " swamp. "); 
	} 


    public void display() {
		System.out.print(this.name + " is a Crocodile. "); 
		System.out.print("He is " + this.age + " years old. ");
		exist();
		move();
		System.out.print("He moves at a rate of " + this.speed + " miles per hour. ");
		favoriteFood(); 
		isDangerous(isDangerous); 
		tailLength(tailLength); 
		nameOfSwamp(nameOfSwamp); 
		deathRoll();
		System.out.println("\n");
	}

}
