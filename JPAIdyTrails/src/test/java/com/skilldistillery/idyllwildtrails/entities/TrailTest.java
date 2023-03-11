package com.skilldistillery.idyllwildtrails.entities;

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

class TrailTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Trail trail;

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAIdyTrails");
	}

// before any test are run we create factory. 
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
//		grab the trail that is associated with the PK 1
		 trail = em.find(Trail.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		trail = null;
	}
	
	@Test
	void test_Trail_entity_mapping() {
		assertNotNull(trail);
		assertEquals("South Ridge", trail.getName());
	}

}
