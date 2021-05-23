package com.hrms.emre.business.abstracts;

import java.util.List;
import java.util.Optional;

import com.hrms.emre.entity.concretes.JobTitle;

public interface JobTitleService {

	void save (JobTitle jobTitle);
	List<JobTitle> findAll();
	Optional<JobTitle> findOneByTitle(String title);
	
}
