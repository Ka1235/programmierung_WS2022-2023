/*
 * In dieser Aufgabe soll das Zusammenspiel von Arrays und For-Schleifen geuebt
 * werden. In den meisten Methoden ist dem Parameter elements das Schluessel-
 * wort "final" vorangestellt. Das bedeutet, dass das Array in der Methode nur
 * gelesen, nicht aber beschrieben werden darf.
 */
public class ArraysAndLoops {
	
	// Diese Methode soll die Elemente des als Parameter (elements) uebergebenen
	// Arrays addieren und die Gesamtsumme zurueckgeben.
	public static int sum(final int[] elements){
		int s = 0 ;
		for(int i = 0; i < elements.length; i++) s+=elements[i] ;
		return s;
	}
	
	// Diese Methode soll in einem als Parameter (elements) uebergebenen Array
	// das groesste Element finden. Rueckgabewert soll das Produkt aus dem
	// groessten Element und dem Index des groessten Elements sein.
	// Beispiel: Eingabe   = {2, 13, 56, 44, 5}
	//           Rueckgabe = 56 (groesstes Element) * 2 (Index von 56) = 112
	// Nicht vergessen, dass die Indizierung in einem Array mit 0 beginnt!
	public static int maxElement(final int[] elements){
		int max = elements[0] ; 
		for(int i=0; i < elements.length; i++) {
			if(max < elements[i]) max = elements[i] ;
		}
		int stelleMax = 0;
		for(int j=0; j < elements.length; j++) {
			if(elements[j] == max) stelleMax = j ;
		}
			
		return max*stelleMax;
	}

	// Diese Methode soll ein Array zurueckgeben, in dem alle Elemente des
	// uebergebenen Arrays dupliziert wurden und in der gleichen Reihenfolge
	// wie im Originalarray stehen. Beispiel:
	// Übergeben wird ein Array der Form {4, 16, 8},
	// Das zurueckgegebene Array soll dann {4, 4, 16, 16, 8, 8} beinhalten.
	public static int[] duplicateElements(final int[] elements){
		int[] duplicated = new int[elements.length * 2];

	    for (int i = 0, j = 0; i < elements.length; i++, j++) 
	        duplicated[j] = duplicated[++j] = elements[i];

	    return duplicated;
	}
	
	// Diese Methode soll zu einem uebergebenen Array ein neues Array zurueck
	// geben, in dem zu jedem Element des Ausgangsarrays das Quadrat steht.
	// Beispiel: Eingabe   = {4,  12,  7}
	//           Rueckgabe = {16, 144, 49}
	public static int[] getSquares(final int[] elements){
		int[] array = new int[elements.length] ;
		for(int i=0; i < elements.length; i++) array[i] = elements[i]*elements[i] ;
		return array ;
	}
	
	// Diese Methode soll in einem uebergebenen Array die Reihenfolge der
	// Elemente umkehren.
	// Beispiel: Eingabe   = {4,  12,  7, 18}
	//           Rueckgabe = {18,  7, 12, 4}
	// ACHTUNG: Diese Methode hat keine Rueckgabe. Das Array Elements soll
	// nach Ausfuehrung der Methode das Ergebnis beinhalten.
	public static void vertausche(int[]array, int index1, int index2) {
		int x = array[index1] ;
		array[index1] = array[index2] ;
		array[index2] = x ;
	}  
	
	public static void reverseArray(int[] elements){
		for(int i=0; i < elements.length/2; i++) vertausche(elements, i, elements.length-1-i ) ;
	}
	
	

	// Hier koennt ihr eure Methoden testen.
	public static void main(String[] args) {

	}
}