package fr.formation.inti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Table base de donnée   T_User
@Entity
@Table(name="t_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUser")
	private Integer userId;
	private String login;
	private String password;
	@OneToOne
	@JoinColumn(name = "emp_id", nullable = false)
	private Employee emp;
	
	
	
	public User() {
	}
	
	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
		
	}
	public User(Integer userId, String login, String password) {
		super();
		this.userId = userId;
		this.login = login;
		this.password = password;
		
	}
	
	
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", login=" + login + ", password=" + password + 
				 "]";
	}
	
	
	
	

}
