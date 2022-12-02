package com.edix.cajerovirtual.entitybeans;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;
import java.util.Objects;


/**
 * The persistent class for the cuentas database table.
 * 
 */
@Entity
@Table(name="cuentas")
public class Cuenta implements Serializable {
	private static final long serialVersionUID = 1L;

	
	/*
	 * Creamos las anotaciones ID (porque en la tabla este atributo es PK.
	 * 
	 * Cada atributo que no se llame IGUAL que las columnas de la tabla, hay que anotarlas con @Column + name.
	 * 
	 */
	@Id
	@Column(name="id_cuenta")
	private int idCuenta;

	private double saldo;

	@Column(name="tipo_cuenta")
	private String tipoCuenta;


	public Cuenta() {
	}
	
	

	public Cuenta(int idCuenta, double saldo, String tipoCuenta) {
		super();
		this.idCuenta = idCuenta;
		this.saldo = saldo;
		this.tipoCuenta = tipoCuenta;
	}



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



	@Override
	public int hashCode() {
		return Objects.hash(idCuenta);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cuenta))
			return false;
		Cuenta other = (Cuenta) obj;
		return idCuenta == other.idCuenta;
	}



	@Override
	public String toString() {
		return "Cuenta [idCuenta=" + idCuenta + ", saldo=" + saldo + ", tipoCuenta=" + tipoCuenta
				 + "]";
	}
	
	

}