package com.skilldistillery.job.data;

import com.skilldistillery.job.entities.Job;

public interface JobDAO {
	Job findById(int jobId);
}
