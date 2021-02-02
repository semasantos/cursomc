package br.com.semasantos.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.semasantos.cursomc.domain.Categoria;
import br.com.semasantos.cursomc.repositories.CategoriaRepository;
import br.com.semasantos.cursomc.services.exceptions.ExcecaoObjetoNaoEncontrado;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(
				() -> new ExcecaoObjetoNaoEncontrado("Objeto não encontrado: "
						+ id + ", tipo: " + Categoria.class.getName())
		);
				
	}

}
