package entity;

public class Account {
	public int id;
	public String name;
	public String email;
	public String  phone;
	public String address;
	
	public Account(int id, String name, String email, String phone, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
}
