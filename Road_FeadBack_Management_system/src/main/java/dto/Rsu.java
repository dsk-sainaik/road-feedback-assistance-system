package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rsu {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userNameRsu;
	private String passWordRsu ;

	
	public void setId(int id) {
		this.id = id;
	}
	

	public int getId() {
		return id;
	}


	public void setUserNameRsu(String userNameRsu) {
		this.userNameRsu = userNameRsu;
	}

	public void setPassWordRsu(String passWordRsu) {
		this.passWordRsu = passWordRsu;
	}

	public String getUserNameRsu() {
		return userNameRsu;
	}

	public String getPassWordRsu() {
		return passWordRsu;
	}

}
