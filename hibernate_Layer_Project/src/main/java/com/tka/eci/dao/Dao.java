package com.tka.eci.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.eci.entity.Candidate;

public class Dao {
	
	public Candidate getAllSelectCandidate() {
		Configuration cfg=new Configuration();
		
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Candidate candidate = session.load(Candidate.class, 1);
		
		return candidate;
		
	}
	
	public int insertCandidate() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Candidate candidate=new Candidate(12,"Balaso Shivaji Patil","Independent","KaradNorth","Maharashtra","Male",48);
		
		session.save(candidate);
		tx.commit();
		
		return 0;
		
	}
	public int updateCandidate() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Candidate candidate=new Candidate(12,"Balaso Shivaji Patil","Independent","KaradNorth","Maharashtra","Male",50);
		
		session.update(candidate);
		tx.commit();
		return 0;
		
	}
	
	public int deleteCandidate() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Candidate candidate=session.get(Candidate.class, 12);
		
		session.delete(candidate);
		tx.commit();
		return 0;
		
	}
	public int saveOrUpdateCandidate() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Candidate candidate=new Candidate(12,"Balaso Shivaji Patil","Independent","KaradNorth","Maharashtra","Male",50);
		
		session.saveOrUpdate(candidate);
		tx.commit();
		
		return 0;
		
	}

}
