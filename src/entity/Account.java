package entity;

public class Account implements IStudy, IPlay {
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

	@Override
	public void Hoc() {
		System.out.println("Hoc java");
	}

	@Override
	public void LamBaiTap() {
		System.out.println("Lam bai tap");
	}

	@Override
	public void Thi() {
		System.out.println("");
	}
// interface của IPlay tạo thêm 
	@Override
	public void Game() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Sport() {
		// TODO Auto-generated method stub
		
	}
}
