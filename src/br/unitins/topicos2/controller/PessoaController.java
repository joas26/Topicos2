package br.unitins.topicos2.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	
	
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Topicos2");
	private EntityManager em = emf.createEntityManager();
	
	private Pessoa pessoa= null;
	private List<Pessoa> listaPessoa= null;
	
	public void incluir() {
		
		System.out.println("Incluir");
		em.getTransaction().begin();
		em.persist(getPessoa());
		em.getTransaction().commit();
		limpar();
		System.out.println("Feito");
	}
	
		public void limpar() {
		
		System.out.println("Limpar");
		setPessoa(null);
		listaPessoa = null;
		}
		
		
	
		public List<Pessoa> getListaPessoa() {
			
			if(listaPessoa == null) {
			   listaPessoa = em.createQuery("Select p From Pessoa p ").getResultList();
			   if(listaPessoa == null)
				   listaPessoa = new ArrayList<Pessoa>();
			}
			
			return listaPessoa;
		}

	public Pessoa getPessoa() {
		
		if(pessoa == null)
			pessoa = new Pessoa();
		
		return pessoa;
	}
		
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
		
	
		
		
	
		
		


}
