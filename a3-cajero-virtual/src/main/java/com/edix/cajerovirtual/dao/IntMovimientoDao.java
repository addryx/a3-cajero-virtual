package com.edix.cajerovirtual.dao;

import java.util.List;

import com.edix.cajerovirtual.entitybeans.Cuenta;
import com.edix.cajerovirtual.entitybeans.Movimiento;

public interface IntMovimientoDao {
	
	List<Movimiento> findMovimientosByIdCuenta(int idCuenta); // Método que lista los movimientos de una cuenta
	
	int movimientoExtraccion(Cuenta cuenta, double cantidad); // Método que permite crear un movimiento que extrae dinero de una cuenta

	int movimientoIngreso(Cuenta cuenta, double cantidad); // Método que permite crear un movimiento que ingrese dinero en una cuenta
	
}
