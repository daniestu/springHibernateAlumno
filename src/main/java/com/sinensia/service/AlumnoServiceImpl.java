package com.sinensia.service;

import java.util.List;

import com.sinensia.dao.AlumnoDao;
import com.sinensia.model.Alumno;

public class AlumnoServiceImpl implements AlumnoService{

	private AlumnoDao alumnoDao;

	public AlumnoDao getAlumnoDao() {
		return alumnoDao;
	}
	public void setAlumnoDao(AlumnoDao alumnoDao) {
		this.alumnoDao = alumnoDao;
	}
	
	@Override
	public void add(Alumno alumno) {
		getAlumnoDao().add(alumno);
	}
	@Override
	public Alumno getById(Integer alumnoId) {
		return getAlumnoDao().getById(alumnoId);
	}
	@Override
	public List<Alumno> getAll() {
		return getAlumnoDao().getAll();
	}
	@Override
	public void delete(Integer alumnoId) {
		getAlumnoDao().delete(alumnoId);
	}
}
