package com.example.MysqlAccess.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="m_customer")
public class Customer {
	@Id
	@Column(name="c_cd" ,columnDefinition = "CHAR(4)")
	private String c_cd;
	
	@Column(name="c_name" ,nullable = false ,columnDefinition = "CHAR(100)")
	private String c_name;
	
	@Column(name="address" ,columnDefinition = "CHAR(256)")
	private String address;

	@Column(name="tel" ,columnDefinition = "CHAR(11)")
	private String tel;

	public String getC_cd() {
		return c_cd;
	}
	public void setC_cd(String c_cd) {
		this.c_cd = c_cd;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}	
	public void setAll(  String c_cd
						,String c_name
						,String address
						,String tel
						) {
		this.c_cd = c_cd;
		this.c_name = c_name;
		this.address = address;
		this.tel = tel;
	}

}
