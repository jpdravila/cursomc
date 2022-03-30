package com.nelioalves.cursomc.repositories;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
