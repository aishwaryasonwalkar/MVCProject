package model;

import java.io.Serializable;

public class SuperUser implements Serializable {
	

	String name;
	String Password;
	String Profession;

	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return Profession;
	}
	public void setProfession(String profession) {
		Profession = profession;
	}
	@Override
	public String toString() {
		return "SuperUser  name=" + name + ", Password=" + Password + ", Profession=" + Profession + "";
	}
	
}
