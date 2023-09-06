package com.dakr.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "VOTER_ID")
public class Voter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer voterId;

	private String voterUniqueNo;
	
	private LocalDate issueDate;


	@OneToOne
	@JoinColumn(name = "personid")
	private Person person;
}
