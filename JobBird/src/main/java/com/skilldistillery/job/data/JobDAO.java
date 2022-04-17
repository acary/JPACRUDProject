package com.skilldistillery.job.data;

import java.util.List;

import com.skilldistillery.job.entities.Job;

public interface JobDAO {
	Job findById(int jobId);

	List<Job> findAll();
}
