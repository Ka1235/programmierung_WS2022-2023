//	-------------------- Aufgabe 3 --------------------
// Aufgabe 3 a)
public class Student extends Human {
	
	private int matrikelNr;
	
	// Aufgabe 3 a)
	public Student(boolean earlyRiser, String nation, int mat) {
		super(earlyRiser,nation) ;
		this.matrikelNr = mat ;
	}
	
	// Aufgabe 3 b)
	public double bedTime() {
		double sleepTime = super.bedTime() + 2 ;
		return (sleepTime >= 24)? 24 : sleepTime ;
	}
	

    // Aufgabe 3 c) 
	public boolean under18 () {
		return this.getAge() < 18 ;
	}
	
	// Ende des zu bearbeitenden Bereichs
	
	public int getMatrikelNr() {
		return matrikelNr;
	}
}
