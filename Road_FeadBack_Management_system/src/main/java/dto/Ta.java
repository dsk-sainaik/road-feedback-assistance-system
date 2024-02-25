package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userNameTa;
	private String passWordTa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserNameTa() {
		return userNameTa;
	}
	public void setUserNameTa(String userNameTa) {
		this.userNameTa = userNameTa;
	}
	public String getPassWordTa() {
		return passWordTa;
	}
	public void setPassWordTa(String passWordTa) {
		this.passWordTa = passWordTa;
	} ;


}
