//	-------------------- Aufgabe 1 --------------------
// 1 a)
public class Animal extends Creature {
	
	private int numberOfLegs;
	private boolean pet;
	
	
	public Animal (int legs, boolean pet) {
		numberOfLegs = legs;
		this.pet=pet;
	}
	
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int legs) {
		this.numberOfLegs = legs;
	}

	public boolean isPet() {
		return pet;
	}

	public void setPet(boolean pet) {
		this.pet = pet;
	}
	// zu bearbeitender Bereich Fuer Aufgabe 1 a) und b)

	public double bedTime () {
		return 22.0d ;
	}
	
	public Animal reproduce() {
		if(this.getAge() > 8) {
			Animal Kid = new Animal(this.getNumberOfLegs() , this.isPet()) ; 
			return Kid ;
		}
		else
			return null ;
	} 
	
	public void aging() {
		super.aging();
		super.aging();
	}	

}
