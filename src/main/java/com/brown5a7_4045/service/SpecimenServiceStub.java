package com.brown5a7_4045.service;

import org.springframework.stereotype.Component;

import com.brown5a7_4045.dto.SpecimenDTO; // ctrl + shift + o is import shortcut

//service packages are where all business logic will be. for specimen dto in particular.

@Component
public class SpecimenServiceStub implements ISpecimenService {

	@Override
	public SpecimenDTO fetchById (int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		specimenDTO.setLatitude("40.55");
		specimenDTO.setLongitude("-84.51");
		specimenDTO.setDescription("A beautiful Eastern Redbud");
		return specimenDTO;
	}
	
	@Override
	public void save(SpecimenDTO specimenDTO) {
		
	}
	
}
