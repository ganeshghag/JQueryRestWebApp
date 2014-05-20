package com.ghag.rnd.rest.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataRow {
	
	private long id;
	private Date invDate;
	private Double amount;
	private Double tax;
	private Double total;
	private String notes;
	
	public DataRow() {
		
	}
	
	public DataRow(long id) {
		this.id = id;
		invDate = new Date();
		amount = new Double("100.99");
		tax = new Double("10.99");
		total = new Double("110.99");
		notes = "notes for id = " + id;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getInvDate() {
		return invDate;
	}
	public void setInvDate(Date invDate) {
		this.invDate = invDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public List<String> toStringArray(){
		List<String> ret = new ArrayList<String>();
		ret.add(""+id);
		ret.add(""+invDate);
		ret.add(""+amount);
		ret.add(""+tax);
		ret.add(""+total);
		ret.add(""+notes);
		
		return ret;
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DataRow [id=");
		builder.append(id);
		builder.append(", invDate=");
		builder.append(invDate);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", tax=");
		builder.append(tax);
		builder.append(", total=");
		builder.append(total);
		builder.append(", notes=");
		builder.append(notes);
		builder.append("]");
		return builder.toString();
	}
	
	

}
