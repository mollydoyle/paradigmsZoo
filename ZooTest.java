import java.util.Scanner; 
import java.util.ArrayList;

public class ZooTest{
	public static void printDescriptions(ArrayList<Animal> zoo){	
		int i;
		System.out.println("Animal Management System\n");
		for(i=0;i<zoo.size();i++) {
			zoo.get(i).display();
		} 
	}

	public static void main(String args[]) {
		Animal num1 = new Dog("Johnathan", 2, false, "Siberian Husky");
		Animal num2 = new Dog("Stewart", 12, false, "German Shepard");
		Animal num3 = new Lion("Josh", 4, false, 3.5);
		Animal num4 = new Lion("Drake", 9, false, 3.7);
		Animal num5 = new Eagle("Arthur", 23, 72, true, 8.1);
		Animal num6 = new Eagle("Gerald", 7, 45, true, 6.2);
		Animal num7 = new Flamingo("Zach", 13, 21, false, 2.9, "Pink");
		Animal num8 = new Flamingo("Cody", 1, 18, false, 1.7, "Gray");
		Animal num9 = new Crocodile("Larry", 7, 5, 3.4, "The Great Dismal", true);
		Animal num10 = new Crocodile("Berry", 5, 3.2, 2, "Cypress", true);
		Animal num11 = new Tortoise("Ben", 134, .1, 6);
		Animal num12 = new Tortoise("George", 58, .2, 12);

		ArrayList<Animal> zoo = new ArrayList<Animal>();
		zoo.add(num1); 
		zoo.add(num2); 
		zoo.add(num3); 
		zoo.add(num4); 
		zoo.add(num5); 
		zoo.add(num6); 
		zoo.add(num7); 
		zoo.add(num8); 
		zoo.add(num9); 
		zoo.add(num10); 
		zoo.add(num11); 
		zoo.add(num12); 

		printDescriptions(zoo);
	}
}
