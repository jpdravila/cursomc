package com.nelioalves.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {

    @RequestMapping(method = RequestMethod.GET)
    public String listar(){
        return "REST está funcionando";
    }
    /*Estudei o vídeo REST testado então o novo a ser estudado é o
    >Testando a primeira classe de dominio-Categoria*/
}
