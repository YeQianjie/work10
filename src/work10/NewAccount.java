package work10;

public class NewAccount {

	public static void main(String[] args) {
		Account.setannua(5.5);
		Account account=new Account("George",1122,1000);
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		System.out.println("�˻������� "+account.getName());
		System.out.println("�����ʣ� "+Account.getAnnua());
		System.out.println("�� "+account.getBalance());
		java.util.ArrayList<Transaction> list=account.getTransactions();
		System.out.printf("%-30s%-14s%-14s%-15s\n","����ʱ��","��������","���׽��","�˻����");
		for(int i=0;i<list.size();i++) {
			Transaction transaction=(Transaction)(list.get(i));
			System.out.printf("%-35s%-14s%-16s%-15s\n",transaction.getDate(),transaction.getType(),transaction.getAmount(),transaction.getBalance());
			

	}

}
}
