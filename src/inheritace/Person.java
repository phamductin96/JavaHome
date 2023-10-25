package inheritace;

//import java.sql.Date;

public class Person {
	public String Name;
	public int CCCD;
	public String Address;
	public String BOD;
	
	
// Constructor: thuộc tính bắt buộc cần có
	public Person(String name, int cCCD, String address, String bOD) {
		this.Name = name;
		this.CCCD = cCCD;
		this.Address = address;
		this.BOD = bOD;
	}
// Method: các hành động
	public void Eat() {
		System.out.println(" Ăn ");
	}
	
	public void Sleep () {
		System.out.println(" Ngủ");
	}
}
