package com.Project.ESB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.ESB.Model.Compte;

public interface CompteRepository extends JpaRepository<Compte,Long> {
	
}