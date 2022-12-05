package com.edix.cajerovirtual.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edix.cajerovirtual.entitybeans.Cuenta;
import com.edix.cajerovirtual.entitybeans.Movimiento;
import com.edix.cajerovirtual.repository.MovimientoRepository;

@Service
public class MovimientoDaoImpl implements IntMovimientoDao {

	@Autowired
	private MovimientoRepository mRepo;
	
	/*
	 * Método que lista los movimientos de una cuenta
	 */
	@Override
	public List<Movimiento> findMovimientosByIdCuenta(int idCuenta) {
		return mRepo.findMovimientosByIdCuenta(idCuenta);
	}
	
	/*
	 * Método que muestra un listado de los últimos movimientos que ha tenido una cuenta.
	 * Hemos fijado que muestre un listado máximo de 10 movimientos.
	 */
	@Override
	public List<Movimiento> find10UltimosMovimientosbyIdCuenta(int idCuenta) {
		List<Movimiento> lista = new ArrayList<Movimiento>();
		int contador = 0;
		for (int i = mRepo.findMovimientosByIdCuenta(idCuenta).size() - 1; i >= 0; i--) {
			lista.add(mRepo.findMovimientosByIdCuenta(idCuenta).get(i));
			contador++;
			if (contador == 10) {
				break;
			}
		}
		return lista;
	}
	
	/*
	 * Método que permite crear una retirada de una cuenta
	 */
	@Override
	public int movimientoExtraccion(Cuenta cuenta, double cantidad) {
		// Creamos un nuevo movimiento
		Movimiento movimiento = new Movimiento();
		movimiento.setCuenta(cuenta);
		movimiento.setFecha(new Date());
		movimiento.setOperacion("Extracción");
		movimiento.setCantidad(cantidad);
		
		// Ahora añadimos el movimiento a la lista de movimientos
		int filas = 0;
		try {
			mRepo.save(movimiento);
			filas = 1;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return filas;
	}
	
	/*
	 * Método que permite crear un ingreso de una cuenta
	 */
	@Override
	public int movimientoIngreso(Cuenta cuenta, double cantidad) {
		Movimiento movimiento = new Movimiento();
		movimiento.setCuenta(cuenta);
		movimiento.setFecha(new Date());
		movimiento.setOperacion("Ingreso");
		movimiento.setCantidad(cantidad);
		
		// Ahora añadimos el movimiento a la lista de movimientos
		int filas = 0;
		try {
			mRepo.save(movimiento);
			filas = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filas;
	}
}
