import java.util.Scanner; 
import java.util.ArrayList;

public class ZooTest{
	public static ArrayList<Animal> zoo = new ArrayList<Animal>();

	public static void printDescriptions(){	
		int i;
		System.out.println("Animal Management System\n");
		for(i=0;i<zoo.size();i++) {
			zoo.get(i).display();
		} 
	}

	public static void setupAnimals() {
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

		printSummaryView();
		printVerboseList();
	}

	public static void printSummaryView() {
		System.out.println("Summary: ");
		System.out.println("There are "+ zoo.size() + " animals in the zoo.");
		
		int dogs = 0;
		int lions = 0;
		int eagles = 0;
		int flamingos = 0;
		int crocodiles = 0;
		int tortoises = 0;
		
		for (int i = 0; i < zoo.size(); i++){
			if (zoo.get(i) instanceof Dog){
				dogs++;
			}	
			else if (zoo.get(i) instanceof Lion){
			lions++;
			}
			else if (zoo.get(i) instanceof Eagle){
				eagles++;
			}
			else if (zoo.get(i) instanceof Flamingo){
				flamingos++;
			}
			else if (zoo.get(i) instanceof Crocodile){
				crocodiles++;
			}
			else if (zoo.get(i) instanceof Tortoise){
				tortoises++;
			}
		}
		
		if (dogs>0){
			System.out.println(dogs + " dog(s)");
		}
		if (lions>0){
			System.out.println(lions + " lion(s)");
		}
		if (eagles>0){
			System.out.println(eagles + " eagle(s)");
		}
		if (flamingos>0){
			System.out.println(flamingos + " flamingo(s)");
		}
		if (crocodiles>0){
			System.out.println(crocodiles + " crocodile(s)");
		}
		if (tortoises>0){
			System.out.println(tortoises + " tortoise(s)");
		}
	}

	public static void printVerboseList() {
		System.out.println("Verbose list of animals with details:");
		System.out.println("Name           Species");

		for(int i = 0; i < zoo.size(); i++){
			if(zoo.get(i).getClass().getName().equals("Dog")){
				System.out.println( (i+1) + ": " + zoo.get(i).getAnimalName() + "  Dog");
			}
			else{
				System.out.println( (i+1) + ": " + zoo.get(i).getAnimalName() + "   " + zoo.get(i).getClass().getSimpleName());
			}
		}	
	}

	static void addAnimal(String animalInformation){
		String[] animal = animalInformation.split(" ");
		Animal a;
		if(animal[0].equals("dog")) {
			a = new Dog(animal[1], animal[2]);
		}
		else if(animal[0].equals("lion")) {
			a = new Lion(animal[1], Double.valueOf(animal[2]));
		}
		else if(animal[0].equals("eagle")) {
			a = new Eagle(animal[1], Boolean.parseBoolean(animal[2]));
		}
		else if(animal[0].equals("flamingo")) {
			a = new Flamingo(animal[1], Boolean.parseBoolean(animal[2]));
		}
		else if(animal[0].equals("crocodile")) {
			a = new Crocodile(animal[1], Double.valueOf(animal[2]));
		}
		else if(animal[0].equals("tortoise")) {
			a = new Tortoise(animal[1], Double.valueOf(animal[2]));
		}
		else {
			System.out.println("error");
			return;
		}
		zoo.add(a);
		printSummaryView();
	}

  static void deleteAnimal(String name){
		for(int i = 0; i<zoo.size();i++) {
			if(zoo.get(i).getAnimalName().equals(name)) {
				zoo.remove(i);
				printSummaryView();
				return;
			}
		}
	}

  static void displayAnimal(String name) {
		for(int i = 0; i<zoo.size();i++) {
			if(zoo.get(i).getAnimalName().equals(name)) {
				System.out.print(zoo.get(i).getAnimalName() + " the " + zoo.get(i).getClass().getName() + " ");
				zoo.get(i).specialProperty();
				System.out.println();
				printSummaryView();
				return;
			}
		}
	}

	static void printInteractiveOptions(){
		Scanner in =  new Scanner(System.in);
		String response = "";

		while(!response.equals("exit")) {
			System.out.println("Type exit at any time to end the program.");
			System.out.println("Options: ");
			System.out.println("Add an animal with: add");
			System.out.println("Delete an animal with: delete");
			System.out.println("Display an animal with: display");
			response = in.nextLine();
			if(response.equals("add")) {
				System.out.println("What animal would you like to add to the zoo?");
				response = in.nextLine();
				addAnimal(response);
			}
			else if(response.equals("delete")) {
				System.out.println("What animal would you like to remove from the zoo?");
				response = in.nextLine();
				deleteAnimal(response);
			}
			else if(response.equals("display")) {
				System.out.println("What animal would you like to display information about?");
				response = in.nextLine();
				displayAnimal(response);
			}
			else if(response.equals("exit")){}
			else {
				System.out.println("Response did not match any of the options... please enter agiain");
			}
		}
		in.close();
	}

	public static void main(String args[]) {
		setupAnimals();
		printInteractiveOptions();
	}
}
