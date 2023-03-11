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
	public Trail create(Trail trail) {
		Trail newTrail = new Trail();
		newTrail.setName(trail.getName());
		newTrail.setDistance(trail.getDistance());
		newTrail.setElevationGain(trail.getElevationGain());
		newTrail.setElevationLoss(trail.getElevationLoss());

		 em.persist(newTrail);
		 return trail;
	}
// reminder 
//	NO begin/commit transaction stuff
//	no em.close() anywhere

	@Override
	public Trail update(int id, Trail trail) {
		Trail trailUpDate = em.find(Trail.class, id);
		trailUpDate.setName(trail.getName());
		trailUpDate.setDistance(trail.getDistance());
		trailUpDate.setElevationGain(trail.getElevationGain());
		trailUpDate.setElevationLoss(trail.getElevationLoss());
		return trailUpDate;
	}

	@Override
	public boolean deleteById(int id) {
		boolean trailGone = false;
		Trail trailD = em.find(Trail.class, id);
		if (trailD != null) {
			em.remove(trailD);
			trailGone = true;
		}
		return trailGone;

	}
}