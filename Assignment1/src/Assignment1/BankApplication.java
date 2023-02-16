package Assignment1;
import java.util.*;

class BankApplication{
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Name : ");
	String name = sc.nextLine();
	System.out.println("Enter your Mobile Number : ");
	long m_no = sc.nextLong();
	System.out.println("Enter your Account number : ");
	long a_no = sc.nextLong();
	System.out.println("Enter your Balance : ");
	long balance = sc.nextLong();
	System.out.println();
	
	Information i1 = new Information();
	i1.info(name, m_no, a_no, balance);
	
	operation op = new operation();
	
	
	System.out.println("Enter your choice : ");
	
	System.out.println("1. Deposite  \n 2. Withdraw  \n 3. Balance \n 4. Exit");
	int ch= sc.nextInt();
	
	if(ch==4) {
		System.exit(0);
	}
	
	while(!(ch==4)) {
	switch(ch) {
	case 1:
		System.out.println("Enter amount you want to deposite : ");
		int d = sc.nextInt();
		balance=op.deposite(balance, d);
		System.out.println("Amount you entered is : "+ d);
		System.out.println("Updated Balance is : "+ balance);
		break;
		
	case 2:
		System.out.println("Enter amount you want to withdraw : ");
		int w = sc.nextInt();
		balance=op.withdraw(balance, w);
		System.out.println("Amount you entered is : "+ w);
		System.out.println("Updated Balance is : "+ balance);
		break;
		
	case 3:
		op.bal(balance);
		break;
		
	case 4:
		System.exit(0);
		break;
		
	default:
		System.out.println("Enter valid choice...");
	}
	System.out.println("1. Deposite  \n 2. Withdraw  \n 3. Balance \n 4. Exit");
	ch= sc.nextInt();
	}
	
	}
}

class operation{
	long deposite(long bal, long cr) {
		bal += cr;
		return bal;
	}
	long withdraw(long bal, long debit) {
		bal -=  debit;
		return bal;
	}
	void bal(long bal) {
		System.out.println("Account Balance is : "+ bal);
	}
}

class Information{
	public void info(String name, long no, long acc, long bal) {
		System.out.println("Account holder name : "+ name);
		System.out.println("Account holder's mobile number : "+ no);
		System.out.println("Account Number : "+ acc);
		System.out.println("Account Balance : "+ bal);

	}
}