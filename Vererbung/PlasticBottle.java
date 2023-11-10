               //Aufgabe 1
public class PlasticBottle extends Bottle {

	// Aufgabe 1
	public PlasticBottle(double liter, String brand) {
		super(liter, brand) ;
	}

	// Aufgabe 2
	public double deposit() {
		return ( this.getBrand().equals("Geotaler") ) ? 0.5 + this.getLiter() : 0.25f;
	}

}
