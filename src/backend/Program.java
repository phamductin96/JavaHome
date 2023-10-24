package backend;

import entity.Account;

public class Program {

	public static void main(String[] args) {
	Account account1 = new Account(1,"Đức Tín", "ductin@gmail.com", "01234", "Hà Nội");
	System.out.println(account1.id + " " + account1.name + " " + account1.email + " " + account1.address);
	}

}
