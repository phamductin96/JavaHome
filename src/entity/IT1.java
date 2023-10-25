package entity;

public class IT1 implements IStudy {
	public int id;
	public String name;
	public String email;
	public String  phone;
	public String address;
	
	public void LamDuAn(){  // Tự khởi tạo riêng của Method (hành động riêng)
		System.out.println(" Làm đồ án");
	}
	
	@Override
	public void Hoc() {
		System.out.println(" Hoc java");
	}
	@Override
	public void LamBaiTap() {
		System.out.println(" lam bai tap");
	}
	@Override
	public void Thi() {
		System.out.println("thi lop it1");
	}
}
