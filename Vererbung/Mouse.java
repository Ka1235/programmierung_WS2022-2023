//--------------------- Aufgabe 2 ---------------------
public class Mouse extends Animal
{
	public void eat (Food food) {
		if(food.getTyp().equals("Cheese")|| food.getTyp().equals("Peanuts")) {
			if(food.getVolume() >= this.hunger)
				this.hunger = 0 ;
			else
				this.hunger -= food.getVolume() ;
		}
	}
	
	public void getHungry() {
		this.hunger +=5 ;
	}
	 public int getWeight () {
		 return weight ;
	 }
}