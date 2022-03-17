package com.sinensia.service;

import java.util.List;

import com.sinensia.model.Alumno;

public interface AlumnoService {
	public abstract void add(Alumno alumno);
	public abstract Alumno getById(Integer alumnoId);
	public abstract List<Alumno> getAll();
	public abstract void delete(Integer alumnoId);
}
