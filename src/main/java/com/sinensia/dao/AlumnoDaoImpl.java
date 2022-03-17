package com.sinensia.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;

import com.sinensia.model.Alumno;

public class AlumnoDaoImpl implements AlumnoDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Override
	public void add(Alumno alumno) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Integer alumnoId = (Integer) session.save(alumno);
		session.getTransaction().commit();
		if(alumnoId >0 ) {
			System.out.println("Alumno is created with ID = " + alumnoId);
		}
	}

	@Override
	public Alumno getById(Integer alumnoId) {
		Session session = getSessionFactory().openSession();
		Alumno alumno = session.get(Alumno.class, alumnoId);
		return alumno;
	}

	@Override
	public List<Alumno> getAll() {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("From Alumno");
		@SuppressWarnings("unchecked")
		List<Alumno> alumnoList = query.getResultList();
		return alumnoList;
	}

	@Override
	public void delete(Integer alumnoId) {
		Session session = getSessionFactory().openSession();
		Alumno alumno = session.get(Alumno.class, alumnoId);
		if( alumno != null) {
			session.beginTransaction();
			session.delete(alumno);
			session.getTransaction().commit();
			System.out.println("Alumno is deleted with Id = " + alumnoId);
		}
	}

}
