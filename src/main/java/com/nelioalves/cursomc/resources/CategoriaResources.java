package com.nelioalves.cursomc.resources;

import com.nelioalves.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar(){

        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Escritorio");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);

        return lista;
    }
}
