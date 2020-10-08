package com.brown5a7_4045.service;

import com.brown5a7_4045.dto.SpecimenDTO;


/**
 * CRUD operations for specimens
 * @author Administrator
 *
 */
public interface ISpecimenService {
	/**
	 * Get specimens from persistence layer
	 * @param id a unique lookup
	 * @return a specimen with a matching id
	 */
	SpecimenDTO fetchById(int id);

	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 *
	 */
	void save(SpecimenDTO specimenDTO);

}
