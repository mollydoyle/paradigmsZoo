public class Flamingo extends Bird {

    // properties 
    double legLength = 8;
	boolean standOnOneLeg = true; 

    // constructor 
    Flamingo(double legLength) {
      this.legLength = legLength;
    }

    // behavior 
    public boolean standOnOneLeg(boolean standOnOneLeg) {
		return standOnOneLeg; 
	}

}
