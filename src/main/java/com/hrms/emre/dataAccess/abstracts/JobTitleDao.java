package com.hrms.emre.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.hrms.emre.entity.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{
	Optional<JobTitle> findOneByTitle(@Param("") String title);

}
