import java.util.LinkedList;

public class Graph {

	private LinkedList<Crossroad> crossroads;
	private int globalId;

	public Graph() {
		crossroads = new LinkedList<Crossroad>();
		globalId = 1;
	}

	// Beginn des zu Bearbeitenden Bereichs:

	//Aufgabe 1
	public void addCrossroad() {
		Crossroad node = new Crossroad(this.globalId) ;
		crossroads.add(node) ;
		this.globalId++ ;
	}

	//Aufgabe 2
	public Crossroad findCrossroad(int id) {
		Crossroad target = null ;
		for(Crossroad node : this.crossroads) {
			if(node.getId() == id) {
				target = node ;
			}
		}
		return target ;
		
	}

	//Aufgabe 3
	public void addOneWayStreet(int startCrossroadId, int targetCrossroadId, int distance) {
		if(startCrossroadId <= this.globalId && targetCrossroadId >= this.globalId ) {
			Crossroad start = null ;
			Crossroad end = null ;
			for( Crossroad node : this.crossroads) {
				if(node.getId() == startCrossroadId)
					start = node ;
			}
			for( Crossroad node : this.crossroads) {
				if(node.getId() == targetCrossroadId)
					end = node ;
			}
			OneWayStreet edge = new OneWayStreet (end, distance) ;
			start.getOneWayStreets().add(edge);
		}
	}

	//Aufgabe 4
	public int findOneWayStreet(int startCrossroadId, int targetCrossroadId) {
		int distance = -1 ;
		if(startCrossroadId <= this.globalId && targetCrossroadId <= this.globalId ) {
			Crossroad start = null ;
			Crossroad end = null ;
			for( Crossroad node : this.crossroads) {
				if(node.getId() == startCrossroadId)
					start = node ;
			}
			for(OneWayStreet kante : start.getOneWayStreets()) {
				if(kante.getTarget().getId() == targetCrossroadId ) {
					distance = kante.getDistance() ;
				}
			}
		}
		return distance;
		
	}

	//Aufgabe 5
	public void removeOneWayStreet(int startCrossroadId, int targetCrossroadId) {
		if(startCrossroadId <= this.globalId && targetCrossroadId >= this.globalId ) {
			Crossroad start = null ;
			Crossroad end = null ;
			for( Crossroad node : this.crossroads) {
				if(node.getId() == startCrossroadId)
					start = node ;
				if(node.getId() == targetCrossroadId)
					end = node ;
			}
			for(OneWayStreet kante : start.getOneWayStreets()) {
				if(kante.getTarget().equals(end)) {
					kante = null ;
				}
			}
		}
	}

	//Aufgabe 6
	public void removeCrossroad(int id) {
		if(id <= this.globalId) {
			Crossroad node = null ;
			for(Crossroad c : this.crossroads) { //recherche du node a supprimer
				if(c.getId() == id)
					node = c ;
			}
			for(OneWayStreet kante : node.getOneWayStreets())  // suppression de tous les ausgehende kanten
				kante = null ;
			// suppression des eingehende kante
			for(Crossroad x : this.crossroads) {
				for(OneWayStreet y :x.getOneWayStreets()) {
					if(y.getTarget().equals(node))
						y = null ;
				}
			}
		}
	}

	//Aufgabe 7
	public int totalDistance() {
		int distance = 0 ;
		for(Crossroad x : this.crossroads) {
			for(OneWayStreet y :x.getOneWayStreets())
				distance += y.getDistance() ;
		}
		return distance ;
		
	}

	
	// Ende des zu Bearbeitenden Bereiches

	public String toString() {
		if (crossroads.isEmpty()) {
			return "Crossroads im Graphen: []  Der Graph ist leer.";
		}
		String result = "Crossroads im Graphen: " + crossroads;
		for (Crossroad crossroad : crossroads) {
			for (OneWayStreet oneWayStreet : crossroad.getOneWayStreets()) {
				result += "\n" + crossroad + " ---> " + oneWayStreet.getTarget() + "   [distance = "
						+ oneWayStreet.getDistance() + "]";
			}
		}
		return result;
	}

}