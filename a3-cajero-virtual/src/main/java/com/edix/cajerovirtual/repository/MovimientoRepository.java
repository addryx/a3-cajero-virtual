package com.edix.cajerovirtual.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.edix.cajerovirtual.entitybeans.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer>{
	
	@Query("SELECT m FROM Movimiento m WHERE m.cuenta.idCuenta = ?1")
	public List<Movimiento> findMovimientosByIdCuenta(int idCuenta);
	
}
