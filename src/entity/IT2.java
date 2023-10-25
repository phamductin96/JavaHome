package entity;

public class IT2 implements IStudy {
	public int id;
	public String name;
	public String email;
	public String  phone;
	public String address;
	
	public void LamBaiTapLon(){  // Tự khởi tạo riêng của Method (hành động riêng)
		System.out.println(" Làm bài tập lớn");
	}
	
	@Override
	public void Hoc() {
		System.out.println("Hoc Web");
	}
	@Override
	public void LamBaiTap() {
		System.out.println("lam bai tap HTML");
	}
	@Override
	public void Thi() {
		System.out.println("Thi Web");
	}
}
