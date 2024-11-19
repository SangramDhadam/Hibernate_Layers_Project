package com.tka.eci.controller;

import com.tka.eci.entity.Candidate;
import com.tka.eci.service.Service;

public class Controller {
	
	Service service=null;
	
	public Candidate getAllSelectCandidate() {
		service=new Service();
		Candidate Candidate = service.getAllSelectCandidate();
		
		return Candidate;
		
	}
	public int insertCandidate() {
		
		service=new Service();
		service.insertCandidate();
		
		return 0;
		
	}
	public int updateCandidate() {
		
		service=new Service();
		service.updateCandidate();
		
		return 0;
		
	}
	public int deleteCandidate() {
		
		service=new Service();
		service.deleteCandidate();
		
		return 0;
		
	}
	public int saveOrUpdateCandidate() {
		
		service=new Service();
		service.saveOrUpdateCandidate();
		return 0;
		
	}

}
