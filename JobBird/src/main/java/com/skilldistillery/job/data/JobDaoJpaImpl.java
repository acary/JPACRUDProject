package com.skilldistillery.job.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.job.entities.Job;

@Service
@Transactional
public class JobDaoJpaImpl implements JobDAO {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAJobs");

	@PersistenceContext
	private EntityManager em;

	@Override
	public Job findById(int jobId) {
		return em.find(Job.class, jobId);
	}

	@Override
	public List<Job> findAll() {
		String jpql = "SELECT j FROM Job j";
		return em.createQuery(jpql, Job.class).getResultList();
	}

	@Override
	public Job create(Job job) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(job);
		em.flush();
		em.getTransaction().commit();
		return job;
	}
}
