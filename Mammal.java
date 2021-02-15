//Mammal class inherits from Animal
public class Mammal extends Animal {

    // properties
    boolean isAquatic;
	boolean canSpeak; 

    // constructor
    public Mammal(boolean isAquatic, boolean canSpeak) {
        this.isAquatic = isAquatic;
		this.canSpeak = canSpeak; 
    }

    // behavior 
    public void speak(boolean canSpeak) {
		return canSpeak; 
	}

}
