package com.tka.eci.client;

import com.tka.eci.controller.Controller;
import com.tka.eci.entity.Candidate;

public class ECIClient {

	public static void main(String[] args) {
		
		Controller controller=null;
		
		
//		controller=new Controller();
//		Candidate allSelectCandidate = controller.getAllSelectCandidate();
//		
//		System.out.println(allSelectCandidate);
//		
//		controller=new Controller();
//		controller.insertCandidate();
		
//		controller=new Controller();
//		controller.updateCandidate();
		
//		controller=new Controller();
//		controller.deleteCandidate();
		
		controller=new Controller();
		controller.saveOrUpdateCandidate();

	}

}
