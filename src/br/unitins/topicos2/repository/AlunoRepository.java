package br.unitins.topicos2.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.topicos2.model.Aluno;
import br.unitins.topicos2.model.Pessoa;

public class AlunoRepository extends Repository<Aluno> {

	
	public AlunoRepository(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public List<Aluno> getAlunos(String nome) {
		
		Query query = (Query) getEntityManager().createQuery("Select p From Aluno p WHERE p.nome LIKE :nome Order by p.nome ");
		query.setParameter("nome","%" + nome +"%");
		
		List<Aluno> lista = query.getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Aluno>();
		
		
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Aluno> getAlunos(){
		
		List<Aluno> lista = getEntityManager().createQuery("Select p From Aluno p Order by p.id desc ").getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Aluno>();
		return null;		
	}
	

}
