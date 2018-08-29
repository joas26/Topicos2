package br.unitins.topicos2.controller;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.unitins.topicos2.model.Pessoa;

@Named
@ViewScoped
public class PessoaController implements Serializable {
	
	private static final long serialVersionUID = 8637843622408548669L;
	public static void main(String[]args) {
		Pessoa p = new Pessoa("joao","rua10","maria@gmail.com");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Topicos2");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println("Feito");
		
	}

}
