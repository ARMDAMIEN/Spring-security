package fr.formation.inti.entity;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Usr extends Employee{
	
	@NotEmpty
	private String name;
	
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",message="doit contenir une majuscule,une minuscule, un caractère spécial et un chiffre")
	private String pass;
	
	@Email(message="entrez un email valide")
	private String email;
	
	@Max(value=2,message="on ne peut pas avoir plus de deux")
	private Integer enfant;
	
	@DateTimeFormat(iso = ISO.DATE)
	private Date date;
	
	 public Integer getEnfant() {
		return enfant;
	}
	public void setEnfant(Integer enfant) {
		this.enfant = enfant;
	}
	public String getName() {  
	        return name;  
	    }  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	    public String getPass() {  
	        return pass;  
	    }  
	    public void setPass(String pass) {  
	        this.pass = pass;  
	    }
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}     
		
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		
	
		
}
