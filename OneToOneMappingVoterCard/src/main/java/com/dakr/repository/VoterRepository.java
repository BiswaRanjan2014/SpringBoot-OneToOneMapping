package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.entity.Voter;

public interface VoterRepository extends JpaRepository<Voter, Integer>{

}
