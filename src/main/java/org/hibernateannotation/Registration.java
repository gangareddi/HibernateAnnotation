package org.hibernateannotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration1")
public class Registration {
	@Id
	private int id;
	@Column(name ="BN")
	private String Bname;
	@Column(name= "BD")
	private String Bdetails;
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(int id, String bname, String bdetails) {
		super();
		this.id = id;
		Bname = bname;
		Bdetails = bdetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getBdetails() {
		return Bdetails;
	}
	public void setBdetails(String bdetails) {
		Bdetails = bdetails;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", Bname=" + Bname + ", Bdetails=" + Bdetails + "]";
	}
	
	

}
