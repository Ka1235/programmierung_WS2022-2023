//--------------------- Aufgabe 1 ---------------------
public class Dog extends Animal
{
	public void eat(Food food) {
		if (food.getTyp().equals("Dogfood")) {
			if(food.getVolume() >= this.hunger)
				this.hunger = 0 ;
			else
				this.hunger -= food.getVolume() ;
		}
	}
}