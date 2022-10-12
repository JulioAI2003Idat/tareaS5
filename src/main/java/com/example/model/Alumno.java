package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="alumnos")
public class Alumno{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAlumno;
	private String nombre;
	private String apellido;
	private String edad;
	private Integer dni;
	
}