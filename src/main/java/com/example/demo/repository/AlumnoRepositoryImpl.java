package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Alumno;

@Repository
public class AlumnoRepositoryImpl implements AlumnoRepository{
	
	private static List<Alumno>	alumnos = new ArrayList<>();
	
	static {
		Alumno alumno = new Alumno();
		alumno.setId(1);
		alumno.setNombre("Ricardo");
		alumno.setApellidos("Cruz Ambrosio");
		alumno.setEdad(22);
		alumno.setCarrera("TIC");
		alumnos.add(alumno);
	}
	
	@Override
	public Alumno add(Alumno alumno) {
		// Agrega alumno
		alumno.setId(alumnos.size() + 1);
		alumnos.add(alumno);
		return null;
	}

	@Override
	public List<Alumno> findAll() {
		// Devuelve lista de alumnos
		return alumnos;
	}

}
