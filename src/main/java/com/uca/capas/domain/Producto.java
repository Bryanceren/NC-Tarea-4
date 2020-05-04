package com.uca.capas.domain;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	@Size(min=1, max=12, message = "El campo codigo debe tener una longitud entre 1 y 12 digitos.")
	String codigo;
	
	@Size(min=1, max=100, message = "El campo nombre de producto debe tener una longitud entre 1 y 100 digitos.")
	String nombre;
	
	@Size(min=1, max=100, message = "El campo marca debe tener una longitud entre 1 y 100 digitos.")
	String marca;
	
	@Size(min=1, max=100, message = "El campo descripcion debe tener una longitud entre 1 y 500 digitos.")
	String descripcion;
	
	@Digits(fraction = 0, message ="El campo Existencias no puede tener decimales", integer = 10)
	Integer existencias;
	
	@Pattern(regexp="([0-9]{2})/([0-9]{2})/([0-9]{4})", message = "El formato de la fecha es dd/mm/yyyy")
	String fecha;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getExistencias() {
		return existencias;
	}

	public void setExistencias(Integer existencias) {
		this.existencias = existencias;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
	
	
	

}
