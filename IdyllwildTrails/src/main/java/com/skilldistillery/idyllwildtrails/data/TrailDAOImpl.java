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
		String jpql = "SELECT trail FROM Trail trail ORDER BY distance DESC";
		return em.createQuery(jpql, Trail.class).getResultList();
	}

	@Override
	public Trail create(Trail trail) {
		em.persist(trail);
		return trail;
	}

	@Override
	public Trail update(int id, Trail trail) {
		em.merge(trail);
		return trail;
	}

	@Override
	public boolean deleteById(int id) {
		boolean trailGone = false;
		Trail trailD = em.find(Trail.class, id);
		if (em.contains(trailD)) {
			em.remove(trailD);
			trailGone = true;
		} else {
			trailGone = false;
		}
		return trailGone;
	}

}