package com.nelioalves.cursomc.resources;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.models.Categoria;

@RestController
@RequestMapping(value="/categoria")
public class CategoriaResource {
	
	@RequestMapping()
	public List<Categoria> listar() {
		
		Categoria cat = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(1, "Escritório");
		
		List<Categoria> list = new ArrayList<Categoria>();
		list.add(cat);
		list.add(cat2);
		
		return list;
	}
}
