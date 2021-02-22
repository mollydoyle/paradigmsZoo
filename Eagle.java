// Two Specific Birds
public class Eagle extends Bird {

    // properties 
    double beakSize;

    // constructor
    Eagle(String name, int age, double wingSpan, boolean isEndangered, double beakSize) {
        super(name, age, wingSpan, isEndangered);
        this.beakSize = beakSize;
    }

    Eagle(String name, boolean isEndangered) {
        super(name, isEndangered);
    }

    // behaviors
    public void move() {
        System.out.print("He flys through the sky. ");
    }

    public void catchPreyInTalons() {
        System.out.print("He catches his prey in his talons. ");
    }

    public void display() {
        System.out.print(this.name + " is an eagle. "); 
		System.out.print("He is " + this.age + " years old. ");
        exist();
        move();
        System.out.print("His wingspan is " + this.wingSpan + "inches. ");
        if(this.isEndangered) {
            System.out.print("He is an endangered species. ");
        }
        else {
            System.out.print("He is not an endangered species. ");
        }
        perch();
        System.out.print("His beak is " + this.beakSize + "inches long. "); 
        this.catchPreyInTalons();
        System.out.println("\n");
    }
}
