package com.example.MysqlAccess.Entity;


import java.sql.Timestamp;

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
	
	@Column(name="update_date" ,columnDefinition = "Timestamp")
	private Timestamp update_date;
	
	@Column(name="update_user" ,columnDefinition = "CHAR(256)")
	private String update_user;
	
	@Column(name="create_date" ,columnDefinition = "Timestamp")
	private Timestamp create_date;
	
	@Column(name="create_user" ,columnDefinition = "CHAR(256)")
	private String create_user;

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
	public Timestamp getUpdateDate() {
		return update_date;
	}
	public void setUpdateDate(Timestamp timestamp) {
		this.update_date = timestamp;
	}
	public String getUpdateUser() {
		return update_user;
	}
	public void setUpdateUser(String update_user) {
		this.update_user = update_user;
	}
	public Timestamp getCreateDate() {
		return create_date;
	}
	public void setCreateDate(Timestamp timestamp) {
		this.create_date = timestamp;
	}
	public String getCreateUser() {
		return create_user;
	}
	public void setCreateUser(String create_user) {
		this.create_user = create_user;
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
