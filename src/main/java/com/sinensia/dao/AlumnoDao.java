package com.sinensia.dao;

import java.util.List;

import com.sinensia.model.Alumno;

public interface AlumnoDao {
	public abstract void add(Alumno alumno);
	public abstract Alumno getById(Integer alumnoId);
	public abstract List<Alumno> getAll();
	public abstract void delete(Integer alumnoId);
}
