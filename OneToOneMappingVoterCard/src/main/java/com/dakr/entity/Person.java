package com.dakr.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="person_dls")
public class Person {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long personid;
	
	  private String personName;
	   
	  private String address;
	  
	  private String gender;
	  
	  private long zipCode;
	  
	  @OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
	  private Voter voter;

	

}
