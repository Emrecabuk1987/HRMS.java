package com.hrms.emre.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hrms.emre.business.abstracts.JobTitleService;
import com.hrms.emre.dataAccess.abstracts.JobTitleDao;
import com.hrms.emre.entity.concretes.JobTitle;
@Service
public class JobTitleManager implements JobTitleService {
	
	private JobTitleDao jobTitleDao;
	
	public JobTitleManager(JobTitleDao jobTitleDao) {
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public void save (JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle);
	}
	
	@Override
	public List<JobTitle> findAll() {
		return this.jobTitleDao.findAll();
	}
	@Override
    public Optional<JobTitle> findOneByTitle(String title) {
        return this.jobTitleDao.findOneByTitle(title);
	}
	
}
