package com.skilldistillery.job.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.job.data.JobDAO;
import com.skilldistillery.job.entities.Job;

@Controller
public class JobController {

	@Autowired
	private JobDAO dao;

	@RequestMapping(path = { "/", "home.do" })
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

	@RequestMapping(path = "createJob.do", method = RequestMethod.GET)
	public String startCreateJob(Model model) {
		return "job/create";
	}

	@RequestMapping(path = "createJob.do", method = RequestMethod.POST)
	public String createJob(Job job, Model model) {
		Job jobAdded = dao.createJob(job);
		model.addAttribute("job", jobAdded);
		return "job/show";
	}

	@RequestMapping(path = "updateJob.do", method = RequestMethod.GET)
	public String startUpdateJob(Integer jid, Model model) {
		Job job = dao.findById(jid);
		model.addAttribute("job", job);
		return "job/update";
	}

	@RequestMapping(path = "updateJob.do", params = { "jid", "name" }, method = RequestMethod.POST)
	public String updateJob(String jid, String name, String uri, Model model) {
		Integer jobId = Integer.valueOf(jid);
		Job job = dao.findById(jobId);
		job.setName(name);
		job.setUri(uri);
		dao.updateJob(job);
		model.addAttribute("job", job);
		return "job/show";
	}

	@RequestMapping(path = "deleteJob.do", params = { "jid" }, method = RequestMethod.GET)
	public String deleteJob(String jid, Model model) {
		Integer jobId = Integer.valueOf(jid);
		Job job = dao.findById(jobId);
		if (job != null) {
			dao.deleteJob(job.getId());
		}
		return "redirect:all";
	}
	
	@RequestMapping(path = "searchId.do", method = RequestMethod.GET)
	public String getJobById() {
		return "searchById";
	}

	@RequestMapping(path = "searchId.do", params = "jid", method = RequestMethod.POST)
	public String searchJobById(String jid, Model model) {
		Integer jobId = Integer.valueOf(jid);
		List<Job> jobs = dao.findJobById(jobId);
		model.addAttribute("jobs", jobs);
		return "all";
	}

	@RequestMapping(path = "searchKeyword.do", method = RequestMethod.GET)
	public String getJobByKeyword() {
		return "searchByKeyword";
	}

	@RequestMapping(path = "searchKeyword.do", params = "keyword", method = RequestMethod.POST)
	public String searchJobByKeyword(String keyword, Model model) {
		List<Job> jobs = dao.findJobByKeyword(keyword);
		model.addAttribute("jobs", jobs);
		return "all";
	}

}
