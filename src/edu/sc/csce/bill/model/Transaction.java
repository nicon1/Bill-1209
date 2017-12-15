package edu.sc.csce.bill.model;

import java.math.BigDecimal;

public class Transaction 
{
//	public Transaction() {
//		
//	}
//	public Transaction(Type type,Date transactionDate,double amount, String note) {
//		super();
//		this.type = type;
//		this.transactionDate = transactionDate;
//		this.amount = amount;
//		this.note = note;
//	} // by Monna
	private Type type;
	private Date transactionDate;
//	private double amount; //by Monna
	private BigDecimal amount;
	private String note;
	
	public Transaction(Type charge, Date date2, double d, String string) {
		// TODO Auto-generated constructor stub
	}
	public Type getType()
	{
		return type;
	}
	public void setType(Type type)
	{
		this.type = type;
	}
	public Date getTransactionDate()
	{
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate)
	{
		this.transactionDate = transactionDate;
	}
//		public double getAmount()
//	{
//		return amount;
//	}
//	public void setAmount(double amount)
//	{
//		this.amount = amount;
//	} // Monna
	
	public BigDecimal getAmount()
	{
		return amount;
	}
	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}
	public String getNote()
	{
		return note;
	}
	public void setNote(String note)
	{
		this.note = note;
	}
}
