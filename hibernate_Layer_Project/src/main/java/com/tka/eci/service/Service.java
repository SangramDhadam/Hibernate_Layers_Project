package com.tka.eci.service;

import com.tka.eci.dao.Dao;
import com.tka.eci.entity.Candidate;

public class Service {

	Dao dao = null;

	public Candidate getAllSelectCandidate() {
		dao = new Dao();
		Candidate candidate = dao.getAllSelectCandidate();

		return candidate;

	}

	public int insertCandidate() {

		dao = new Dao();
		dao.insertCandidate();

		return 0;

	}

	public int updateCandidate() {

		dao = new Dao();
		dao.updateCandidate();

		return 0;

	}

	public int deleteCandidate() {

		dao = new Dao();
		dao.deleteCandidate();
		
		return 0;

	}
	public int saveOrUpdateCandidate() {
		
		dao=new Dao();
		dao.saveOrUpdateCandidate();
		
		return 0;
		
	}

}
