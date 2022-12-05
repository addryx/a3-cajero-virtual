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

	@Override
	public List<Cuenta> findAll() {
		return CRepo.findAll();
	}

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

	@Override
	public int ingresarDinero(Cuenta cuenta, double cantidad) {
		// Actualizamos el saldo de la cuenta
		cuenta.setSaldo(cuenta.getSaldo() + cantidad);
		// Actualizamos los valores en la BBDD
		int filas = 0;
		try {
			CRepo.save(cuenta);
			filas = 1;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return filas;
	}

	@Override
	public int extraerDinero(Cuenta cuenta, double cantidad) {
		// Actualizamos el saldo de la cuenta
		cuenta.setSaldo(cuenta.getSaldo() - cantidad);

		// Actualizamos los valores en la BBDD
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
