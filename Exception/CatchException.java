
public class CatchException
{
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	
	// Aufagbe 1
	public static int method1(ClassWithBuggyMethods obj) throws Exception
	{
		try {
			return obj.getElement() ;
		}
		catch (Exception e) {
			return -1 ;
		}
		
	}
	
	// Aufgabe 2
	public static int method2(ClassWithBuggyMethods obj) throws Exception
	{
		try {
			return obj.getLength() ;
		} 
		catch (Exception e) {
			return -1 ;
		}
	}
	
	// Aufgabe 3
	public static String method3(ClassWithBuggyMethods obj)
	{
		try {
			obj.reallyRiskyMethod();
			return "" ;
		} 
		catch (NullPointerException npe) {
			return  "NullPointerException aufgetreten" ;
		}
		catch (IndexOutOfBoundsException iobe) {
			return  "Das haette nicht passieren duerfen"  ;
		}
		catch (ClassCastException cce) {
			throw new NumberFormatException() ;
		}
		catch (RuntimeException rte) {
			return rte.getMessage() ;
		}
		
	}
	
	//=================================
	// Ende des zu bearbeitenden Codes
	//=================================	
}
