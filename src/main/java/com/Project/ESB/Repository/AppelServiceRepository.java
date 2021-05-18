package com.Project.ESB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.ESB.Model.AppelService;

public interface AppelServiceRepository extends JpaRepository<AppelService, Long> {

	AppelService creer(AppelService appelService);

}
