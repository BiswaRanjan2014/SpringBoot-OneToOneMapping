package com.dakr;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dakr.entity.Person;
import com.dakr.entity.Voter;
import com.dakr.repository.PersonRepository;
import com.dakr.repository.VoterRepository;

@SpringBootApplication
public class OneToOneMappingVoterCardApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OneToOneMappingVoterCardApplication.class, args);

		VoterRepository voterRepo = context.getBean(VoterRepository.class);
		PersonRepository personRepo = context.getBean(PersonRepository.class);

		Person person = new Person();
		person.setPersonName("Biswa");
	    person.setAddress("Cuttack");
		person.setGender("Male");
		person.setZipCode(123456);
		
		
		Voter voter = new Voter();
		voter.setVoterUniqueNo("OBG12176");
		voter.setIssueDate(LocalDate.now());
		person.setVoter(voter);
		voter.setPerson(person);
		personRepo.save(person);
	}

}
