package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{

	@Autowired
	private MedicamentoRepository repository;
	
	
	@Override
	public List<Medicamento> listaMedicamento() {
		
		return repository.findAll();
	}
	
	@Override
	public Medicamento insertaActualizaMedicamento(Medicamento obj) {
		return repository.save(obj);
	}

	@Override
	public Optional<Medicamento> obtenerPorId(int idMedicamento) {
		return repository.findById(idMedicamento);
	}
	
	@Override
	public Optional<Medicamento> buscarPorId(int idMedicamento) {
		return repository.findById(idMedicamento);
	}
	
	 @Override
	    public List<Medicamento> obtenerPorNombre(String nombre) {
	        return repository.findByNombreLike(nombre);
	    }
	 
	 @Override
	    public List<Medicamento> obtenerPorStock(int stock) {
	        return repository.findByStock(stock);
	    }

	


	
}
