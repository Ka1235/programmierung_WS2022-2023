//	-------------------- Aufgabe 1 --------------------
// A)
public class Skyscraper extends Building {

	private int apartments;

	public Skyscraper(int apartments) {
		this.apartments = apartments;
	}
// -----Die Methoden fuer A) und B) muessen erst noch eingefuegt werden.-----
	
	public int rentalCosts() {
		int x = 100*getPlotArea() - 300*apartments ;
		return x >= 300 ? x : 300 ;
	}
	
	public void setPlotArea (int plotArea) {
		if(plotArea <= 80 && plotArea >= 20)
			super.setPlotArea(plotArea);
		else 
			this.setPlotArea(35) ;
	}
}
