package br.unitins.topicos2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.topicos2.model.Instrutor;
import br.unitins.topicos2.repository.InstrutorRepository;

@Named
@ViewScoped
public class InstrutorController extends Controller<Instrutor> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3819416611255448958L;
	
	private String pesquisa;
	
	private List<Instrutor> listaInstrutor = null;

	public Instrutor getEntity() {
		if (entity == null)
			entity = new Instrutor();
		return entity;
	}

	@Override
	public void limpar() {
		setEntity(null);
		listaInstrutor = null;
		
	}
	
	public void pesquisar() {
		InstrutorRepository repository = new InstrutorRepository(getEntityManager());
		listaInstrutor = repository.getInstrutor(pesquisa);
		
	}
	
	public List<Instrutor> getListaInstrutor() {
		if (listaInstrutor == null)
			listaInstrutor = new ArrayList<Instrutor>();
		
		return listaInstrutor;
	}

	

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}

}
