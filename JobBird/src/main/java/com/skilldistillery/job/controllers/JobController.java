package com.skilldistillery.job.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.job.data.JobDAO;
import com.skilldistillery.job.entities.Job;

@Controller
public class JobController {

	@Autowired
	private JobDAO dao;
	
	@RequestMapping(path={"/", "home.do"})
	public String home(Model model) {
		model.addAttribute("DEBUG", dao.findById(1));
		return "home";
	}
	
	@RequestMapping(path = { "/all", "all.do" })
	public String index(Model model) {
		List<Job> jobs = dao.findAll();
		model.addAttribute("jobs", jobs);
		return "all";
	}
	
	@RequestMapping(path = "getJob.do")
	public String showJob(Integer jid, Model model) {
		Job job = dao.findById(jid);
		model.addAttribute("job", job);
		return "job/show";
	}
}
