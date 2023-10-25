package frontend;

import inheritace.ITJava;
import inheritace.ITPlus;
import inheritace.Person;

public class PInheritace {

	public static void main(String[] args) {
		Person porson1 = new Person("Pham Duc Tin", 163366, "Hà Nội", "02/08/1996");
		System.out.println(porson1.Name + " " + porson1.CCCD + " " + porson1.BOD );
		
		ITPlus student1 = new ITPlus("Pham Van Trieu", 163355, "Hà Nội", "05/03/2004");
		student1.Eat();
		
		ITJava student11 = new ITJava("Pham Van Trieu", 163355, "Hà Nội", "05/03/2004");
		student11.Sleep();
	}
}
