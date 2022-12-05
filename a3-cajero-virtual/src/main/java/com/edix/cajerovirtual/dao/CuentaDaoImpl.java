package com.edix.cajerovirtual.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edix.cajerovirtual.entitybeans.Cuenta;
import com.edix.cajerovirtual.repository.CuentaRepository;

@Service
public class CuentaDaoImpl implements IntCuentaDao {

	@Autowired
	private CuentaRepository CRepo;
	
	/*
	 * Con este método mostramos una lista con todas las cuentas.
	 */
	@Override
	public List<Cuenta> findAll() {
		return CRepo.findAll();
	}
	
	/*
	 * Con este método encontramos una cuenta a través de su idCuenta, y en caso de no existir devuelve un null.
	 */
	@Override
	public Cuenta findById(int idCuenta) {
		Cuenta cuenta = new Cuenta();
		cuenta.setIdCuenta(idCuenta);
		int pos = CRepo.findAll().indexOf(cuenta);
		if (pos == -1) {
			return null;
		} else {
			return CRepo.findById(idCuenta).orElse(null);
		}
	}
	
	/*
	 * Con este método ingresamos dinero en una cuenta
	 */
	@Override
	public int ingresarDinero(Cuenta cuenta, double cantidad) {
		
		// Aquí actualizamos el saldo de la cuenta tras el ingreso
		cuenta.setSaldo(cuenta.getSaldo() + cantidad);
		
		// Y tras la operación actualizamos los valores en nuestra BBDD
		int filas = 0;
		try {
			CRepo.save(cuenta);
			filas = 1;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return filas;
	}
	
	/*
	 * Con este método retiramos dinero de una cuenta
	 */
	@Override
	public int extraerDinero(Cuenta cuenta, double cantidad) {
		
		// Aquí actualizamos el salado de la cuenta tras la retirada
		cuenta.setSaldo(cuenta.getSaldo() - cantidad);

		// Y tras la operación actualizamos los valores en la BBDD
		int filas = 0;
		try {
			CRepo.save(cuenta);
			filas = 1;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return filas;
	}
}
