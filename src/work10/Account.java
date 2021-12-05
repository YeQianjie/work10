package work10;

import java.util.Date;

class Account {
	private int id;
	private String name;
	private double balance;
	private static double annua;
	private java.util.Date dateCreated;
	private java.util.ArrayList<Transaction> transactions=new java.util.ArrayList<>();
	public Account() {
		Date dataCreated = new java.util.Date();
	}
	
	public Account(String name,int id,double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
		dateCreated=new java.util.Date();
	}
	
	public int getId() {
		return this.id;
	}
	public double getBalance() {
		return balance;
	}
	public java.util.ArrayList<Transaction> getTransactions(){
		return transactions;
	}
	public String getName() {
		return name;
	}
	public static double getAnnua() {
		return annua;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public static void setannua(double annua) {
		Account.annua=annua;
	}
	public double getMonthlyInterest() {
		return balance*(annua/1200);
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	public void withdraw(double amount) {
		balance-=amount;
		transactions.add(new Transaction("È¡¿î",amount,balance,""));		
	}
	public void deposit(double amount) {
		balance+=amount;
		transactions.add(new Transaction("´æ¿î",amount,balance,""));
	}
	
}
	
class Transaction{
	private java.util.Date date;
	private String type;
	private double amount;
	private double balance;
	private String description;
	public Transaction(String type,double amount,double balance,String description) {
		date=new java.util.Date();
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
	}
	public java.util.Date getDate(){
		return date;
	}
	public String getType() {
		return type;
	}
	public double getAmount() {
		return amount;
	}
	public double getBalance() {
		return balance;
	}
	public String getDescription() {
		return description;
	}
}




