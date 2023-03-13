package com.skilldistillery.idyllwildtrails.data;

import java.util.List;

import com.skilldistillery.idyllwildtrails.entities.Trail;

public interface TrailDAO {

	Trail findById(int id);

	List<Trail> findAll();

	Trail create(Trail trail);

	Trail update(int id, Trail trail);

	boolean deleteById(int id);

}
