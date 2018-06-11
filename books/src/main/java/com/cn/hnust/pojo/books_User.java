package com.cn.hnust.pojo;

public class books_User {
    private Integer id;

    private String name;

    private String sex;

    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

	public books_User(Integer id, String name, String sex, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
	}

	public books_User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}