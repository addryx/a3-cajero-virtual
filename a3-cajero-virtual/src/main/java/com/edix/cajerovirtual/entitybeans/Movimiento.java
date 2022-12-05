package com.edix.cajerovirtual.entitybeans;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


/**
 * The persistent class for the movimientos database table.
 * 
 * @Entity significa que es una entidad. 
 * @Table + el nombre de la tabla, para que los relacione. 
 * 
 */
@Entity // Lo usamos para declarar que una clase es una entidad (una tabla BBDD).
@Table(name="movimientos") // El @TABLE es la denominación de la tabla de la BBDD
public class Movimiento implements Serializable { // Denominación de la clase Java
	private static final long serialVersionUID = 1L;

	/*
	 * Este valor es un generador de claves así que le ponemos identity, para que sea auto-increment.
	 * 
	 */
	@Id // Primary key de la tabla Movimientos
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_movimiento") // La anotación @COLUMN es la denominación de la columna que se encuentra en la BBDD
	private int idMovimiento; // Aquí, cambiamos el nombre de la columna, y lo ponemos como se tienen que llamar en la clase Java

	private double cantidad;

	@Temporal(TemporalType.TIMESTAMP) // La anotación @TEMPORAL es debido a que el tipo de variable es DATE, tipo fecha
	private Date fecha;

	private String operacion;

	//bi-directional many-to-one association to Cuenta
	@ManyToOne // De muchos a 1 -> En este caso de muchos movimientos a una sola cuenta
	@JoinColumn(name="id_cuenta") // Denominación de la columna de la BBDD.
	private Cuenta cuenta; // La transformación de la columna a una clase Java 
	
	/*
	 * Contructor de Movimiento sin parámetros
	 */	
	public Movimiento() {
	}
	
	/*
	 * Constructor de Movimiento con parámetros
	 */
	public Movimiento(int idMovimiento, double cantidad, Date fecha, String operacion, Cuenta cuenta) {
		super();
		this.idMovimiento = idMovimiento;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.operacion = operacion;
		this.cuenta = cuenta;
	}

	/*
	 * Getters & Setters
	 */
	public int getIdMovimiento() {
		return this.idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public double getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getOperacion() {
		return this.operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	/*
	 * Método hashcode
	 */
	@Override
	public int hashCode() {
		return Objects.hash(idMovimiento);
	}

	/*
	 * Método equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Movimiento))
			return false;
		Movimiento other = (Movimiento) obj;
		return idMovimiento == other.idMovimiento;
	}
	
	/*
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Movimiento [idMovimiento=" + idMovimiento + ", cantidad=" + cantidad + ", fecha=" + fecha
				+ ", operacion=" + operacion + ", cuenta=" + cuenta + "]";
	}

	
}