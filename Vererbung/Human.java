//	-------------------- Aufgabe 2 --------------------
// 2 a)
public class Human extends Creature {

	private boolean earlyRiser;
	private String nation;

	public Human(boolean earlyRiser, String nation) {
		this.earlyRiser = earlyRiser;
		this.nation = nation;
	}

	public boolean isEarlyRiser() {
		return earlyRiser;
	}

	public void setEarlyRiser(boolean earlyRiser) {
		this.earlyRiser = earlyRiser;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	// zu bearbeitender Bereich Fuer Aufgabe 2 b) und c)

	public Human reproduce() {
		if(this.getAge() > 18) {
			Human kid = new Human((this.getAge()%2) == 0 , this.getNation()) ;
			return kid ;
		}
		else 
			return null ;
	}

	public double bedTime() {
		double sleepTime ;
		switch(nation) {
		case "Narnia" :
			sleepTime = 21 ;
			break ;
		case "Oz" :
			sleepTime = 19;
			break ;
		case "Mordor" :
			sleepTime = 24 ;
			break ;
		default :
			sleepTime = 18; 
		}
		return sleepTime ;
	}
}


