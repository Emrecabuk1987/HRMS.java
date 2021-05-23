package com.hrms.emre.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.emre.business.abstracts.JobTitleService;
import com.hrms.emre.entity.concretes.JobTitle;

@RestController
@RequestMapping(path = "api/job-titles")
public class JobTitlesController {
	private final JobTitleService jobTitleService;
	
	public JobTitlesController(JobTitleService jobTitleService) {
		this.jobTitleService = jobTitleService;
	}
	@GetMapping(path = "getall")
	public List<JobTitle> getAll(){
		return this.jobTitleService.findAll();
	}
}
