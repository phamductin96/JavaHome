package frontend;

import entity.Account;
import entity.IT1;
import entity.IT2;

public class Program {

	public static void main(String[] args) {
		
	//Account account1 = new Account(1,"Đức Tín", "ductin@gmail.com", "01234", "Hà Nội");
	//System.out.println(account1.id + " " + account1.name + " " + account1.email + " " + account1.address);
	
	IT1 student1 = new IT1(); // Hành động của học sinh
	student1.Hoc();
	student1.LamBaiTap();
	student1.LamDuAn();
	
	IT2 student2 = new IT2();
	student2.Hoc();
	student2.Thi();
	
	
	}
}
