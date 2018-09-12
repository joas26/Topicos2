package br.unitins.topicos2.repository;

import javax.persistence.EntityManager;

import br.unitins.topicos2.model.DefaultEntity;
import br.unitins.topicos2.model.Pessoa;

public class Repository<T extends DefaultEntity<T>>  {
	
	private EntityManager em = null;
	
	public Repository(EntityManager em) {
		this.em = em;
	}
	
	protected EntityManager getEntityManager() {
		return em;
	}
	
	// inclui e altera
		public T save(T entity) {
			return getEntityManager().merge(entity);
		}
		
		public void remove(T entity) {
			// metodo para remover no BD
			getEntityManager().remove(entity);
			
		}

}
