package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//creating a table for user credentials
/*
 * First name
 * Last name
 * Email
 * Username
 * Password
 * User id
 */

//still needs a relationship annotation, but i dont have plans for more tables yet


//-------------------------------

@Entity
//----lombok
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "userCred")
public class UserCredentials {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;

	private String Fname;
	private String Lname;
	private String Email;
	private String Username;
	private String Password;
	
}
