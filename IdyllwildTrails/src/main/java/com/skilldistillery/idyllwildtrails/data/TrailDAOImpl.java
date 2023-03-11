package com.skilldistillery.idyllwildtrails.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.idyllwildtrails.entities.Trail;

@Service
@Transactional
public class TrailDAOImpl implements TrailDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Trail findById(int id) {

		return em.find(Trail.class, id);
	}

	@Override
	public List<Trail> findAll() {
		String jpql = "SELECT trail FROM Trail trail";
		return em.createQuery(jpql, Trail.class).getResultList();
	}

	@Override
	public Trail create(Trail id) {
		// TODO Auto-generated method stub
		return null;
	}
// reminder 
//	NO begin/commit transaction stuff
//	no em.close() anywhere
	
	@Override
	public Trail update(int id, Trail trail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
