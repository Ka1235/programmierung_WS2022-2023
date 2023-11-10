//--------------------- Aufgabe 3 ---------------------
public class Cat extends Animal
{
	public void eat(Mouse mouse)
	{
		if(((Animal) mouse).getWeight()/2 >= this.hunger)
			this.hunger = 0 ;
		else
			this.hunger -= ( mouse.getWeight()/2 ) ;
	}	
	
	public void eat(Food food) {
		if (food.getTyp().equals("Catfood")) {
			if(food.getVolume() >= this.hunger)
				this.hunger = 0 ;
			else
				this.hunger -= food.getVolume() ;
		}
	}
}