package com.edix.cajerovirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.edix.cajerovirtual.entitybeans.Movimiento;
import com.edix.cajerovirtual.repository.MovimientoRepository;

@Controller
public class MovimientoController {

	@Autowired
	private MovimientoRepository mrepo;
	
	@GetMapping("/inicio1")
	public String procInicio(Model model) {
		
		Movimiento movimiento = mrepo.findById(1).orElse(null);
		model.addAttribute("movimiento", movimiento);
		return "pruebasjpa";
	}
	
}
