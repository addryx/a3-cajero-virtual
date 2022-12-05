package com.edix.cajerovirtual.dao;

import java.util.List;

import com.edix.cajerovirtual.entitybeans.Cuenta;
import com.edix.cajerovirtual.entitybeans.Movimiento;

public interface IntMovimientoDao {
	
	List<Movimiento> findMovimientosByIdCuenta(int idCuenta);

	List<Movimiento> find10UltimosMovimientosbyIdCuenta(int idCuenta);

	int movimientoExtraccion(Cuenta cuenta, double cantidad);

	int movimientoIngreso(Cuenta cuenta, double cantidad);
	
}
