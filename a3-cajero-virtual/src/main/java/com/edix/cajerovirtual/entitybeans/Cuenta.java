package com.edix.cajerovirtual.entitybeans;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;
import java.util.Objects;

@Entity // Lo usamos para declarar que una clase es una entidad (una tabla BBDD).
@Table(name="cuentas") // Es el nombre de la tabla que está en la BBDD.
public class Cuenta implements Serializable { // Es el nombre que le damos a la clase java. Es serializable porque la implementamos.
	
	private static final long serialVersionUID = 1L;

	@Id // Indicamos que es la primary key de la tabla en la que estamos declarando, en este caso "cuentas".
	@Column(name="id_cuenta") // La anotación @COLUMN es la denominación de la columna que se encuentra en la BBDD
	private int idCuenta; // Aquí cambiamos el nombre de la columna de la BBD, y lo ponemos como se tiene que llamar en una clase Java

	private double saldo;

	@Column(name="tipo_cuenta") // La anotación @COLUMN es la denominación de la columna que se encuentra en la BBDD
	private String tipoCuenta; // Aquí, cambiamos el nombre de la columna, y lo ponemos como se tiene que llamar en la clase Java

	/*
	 * Constructor de Cuenta sin parámetros.
	 */
	public Cuenta() {
	}
	
	/*
	 * Constructor de Cuenta con parámetros.
	 */
	public Cuenta(int idCuenta, double saldo, String tipoCuenta) {
		super();
		this.idCuenta = idCuenta;
		this.saldo = saldo;
		this.tipoCuenta = tipoCuenta;
	}
	
	/*
	 * Los métodos GETTERS & SETTERS
	 */
	public int getIdCuenta() {
		return this.idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipoCuenta() {
		return this.tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
	/*
	 * Método hashcode
	 */
	@Override
	public int hashCode() {
		return Objects.hash(idCuenta);
	}
	
	/*
	 * Métodos equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cuenta))
			return false;
		Cuenta other = (Cuenta) obj;
		return idCuenta == other.idCuenta;
	}
	
	/*
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Cuenta [idCuenta=" + idCuenta + ", saldo=" + saldo + ", tipoCuenta=" + tipoCuenta
				 + "]";
	}
}