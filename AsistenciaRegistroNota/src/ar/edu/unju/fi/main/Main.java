package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno alumno = generarAlumno();
		registrarNotas(alumno, 4);
		
		
		// EL ERROR QUE SALIA ERA PORQUE AL INGTRESAR EL NUMERO DE MATERIAS SE PONIA 2
		// Y EL WHILE ESTABA EN 2, RECORRIA UNA VEZ Y LUEGO PASABA A 3, CUANDO TENIA QUE RESTAR
		// LO ARREGLÉ CON numMaterias-- Y PONIENDO COMO CONDICION DEL BUCLE numMaterias >= 1.

	}
	
	
	
	
	public static Alumno generarAlumno() {
		
		Alumno alumno = new Alumno();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el legajo: ");
		Integer legajo = sc.nextInt();
		System.out.println("Ingrese el apellido: ");
		String apellido = sc.next();
		System.out.println("Ingrese el nombre: ");
		String nombre = sc.next();
		
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		System.out.println(alumno.toString());
		
		return alumno;
		
		
	}
	
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		
		Scanner sc = new Scanner(System.in);
		
		while(numMaterias >=1) {
			//cargar materias
			
			System.out.println("Ingrese el codigo de la materia: ");
			String codigoMateria = sc.next();
			System.out.println("Ingrese el nombre de la materia: ");
			String nombreMateria = sc.next();
			
			Materia materia = new Materia(codigoMateria,nombreMateria);
			
			System.out.println("Ingrese el codigo del registro de nota: ");
			String codigoNota = sc.next();
			System.out.println("Ingrese la nota final: ");
			Float nota = sc.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			
			
			System.out.println(registroNota.toString());
			
			numMaterias--;
			
		}

		sc.close();
		
	}
	
	
	

}
