package com.skilldistillery.job.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JobTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Job job;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAJobs");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		job = em.find(Job.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		emf.close();
		job = null;
	}

	@Test
	void test_Job_entity_mapping() {

		if (job == null) {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			Job job = new Job();
			job.setId(100);
			job.setName("Software Engineer");
			em.persist(job);
			em.flush();
			em.getTransaction().commit();
		}

		assertNotNull(job);
		assertEquals("Software Engineer", job.getName());
	}

}
