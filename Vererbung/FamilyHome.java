//	-------------------- Aufgabe 2 --------------------
// A)
public class FamilyHome extends Building  {

	private int inhabitants;

	public FamilyHome(int inhabitants) {
		this.inhabitants = inhabitants;
	}
// -----Die Methoden fuer A) und B) muessen erst noch eingefuegt werden.------
	
	public int rentalCosts() {
		int x = 50*getPlotArea() - 100*inhabitants;
		return x >= 600 ? x : 600 ;
	}
	
	public void setPlotArea (int plotArea) {
		if(plotArea <= 60 && plotArea >= 30)
			super.setPlotArea(plotArea);
		else 
			this.setPlotArea(35) ;
	}
}


