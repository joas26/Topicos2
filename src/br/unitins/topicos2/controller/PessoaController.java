package br.unitins.topicos2.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.unitins.topicos2.factory.JPAFactory;
import br.unitins.topicos2.model.Pessoa;

@Named
@ViewScoped
public class PessoaController implements Serializable {
	
	private static final long serialVersionUID = 8637843622408548669L;
	
	
	private EntityManager em = null;
	
	private Pessoa pessoa= null;
	private List<Pessoa> listaPessoa= null;
	
	private EntityManager getEntityManager() {
			if(em == null)
			   em = JPAFactory.getEntityManager();
			return em;
	}
	
	
	public void incluir() {
		
		
		getEntityManager().getTransaction().begin();
		
		// metodo para incluir no BD
		getEntityManager().persist(getPessoa());
		
		getEntityManager().getTransaction().commit();
		limpar();
		System.out.println("Incluiu");
	}
	
	public void alterar() {
		
		System.out.println("alterar");
		getEntityManager().getTransaction().begin();
		
		// metodo para alterar no BD
		getEntityManager().merge(getPessoa());
		limpar();
		getEntityManager().getTransaction().commit();
		System.out.println("Alterou");
	}
	
	public void remover() {
		
		getEntityManager().getTransaction().begin();
		
		// metodo para remover no BD
		getEntityManager().remove(getPessoa());
		
		getEntityManager().getTransaction().commit();
		limpar();
		System.out.println("Removeu");
	}
	
	
	
		public void limpar() {
		
		System.out.println("Limpar");
		setPessoa(null);
		listaPessoa = null;
		}
		
		
	
		public List<Pessoa> getListaPessoa() {
			
			if(listaPessoa == null) {
			   listaPessoa = getEntityManager().createQuery("Select p From Pessoa p Order by p.id desc ").getResultList();
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
