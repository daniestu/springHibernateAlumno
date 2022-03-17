package com.sinensia.client;
 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.sinensia.model.Alumno;
import com.sinensia.service.AlumnoService;
import com.sinensia.service.AlumnoServiceImpl;
 
public class ClientTest {
 
	public static void main(String[] args) {
 
		AbstractApplicationContext ctx = null;
		try {
			ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			AlumnoService alumnoService = ctx.getBean(AlumnoServiceImpl.class);
			add(alumnoService);
			getById(alumnoService);
			getAll(alumnoService);
			alumnoService.delete(3);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(ctx != null)
				ctx.close();
		}
	}
 
	private static void getAll(AlumnoService alumnoService) {
		alumnoService.getAll().forEach(System.out::println);
	}
 
	private static void getById(AlumnoService alumnoService) {
		Alumno alumno = alumnoService.getById(1);
		System.out.println(alumno);
	}
 
	private static void add(AlumnoService alumnoService) {
		Alumno alumno = getAlumno();
		alumnoService.add(alumno);
	}
 
	private static Alumno getAlumno() {
		Alumno alumno = new Alumno();
		alumno.setNombre("Pepe");
		alumno.setApellidos("Garcia");
		alumno.setDni("70273386Z");
		return alumno;
	}
 
}
