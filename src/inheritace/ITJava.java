package inheritace;

public class ITJava extends ITPlus {

	public ITJava(String name, int cCCD, String address, String bOD) { // Thừa hưởng lại Constructor cua Person
		super(name, cCCD, address, bOD);
	} 
// Method để trống vì đã thừa hưởng ITPlus ở trên
}
