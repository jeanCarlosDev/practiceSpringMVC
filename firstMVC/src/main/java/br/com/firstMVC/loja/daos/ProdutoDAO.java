package br.com.firstMVC.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.firstMVC.loja.models.Produto;

@Repository
public class ProdutoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Produto produto) {
		manager.persist(produto);
				
	}

}
