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
	public Job createJob(Job job) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(job);
		em.flush();
		em.getTransaction().commit();
		return job;
	}

	@Override
	public int updateJob(Job job) {
		int count = 0;
		EntityManager em = emf.createEntityManager();
		String jpql = "UPDATE Job j SET name = j.name WHERE id = :id";
		em.getTransaction().begin();
		count = em.createQuery(jpql).setParameter("id", job.getId()).executeUpdate();
		em.getTransaction().commit();
		em.close();
		return count;
	}

	@Override
	public boolean deleteJob(int jid) {
		boolean isDeleted = false;
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Job job = em.find(Job.class, jid);
		if (job != null) {
			em.remove(job);
		}
//		em.flush();
		isDeleted = !em.contains(job);
		em.getTransaction().commit();
		em.close();
		return isDeleted;
	}
}
