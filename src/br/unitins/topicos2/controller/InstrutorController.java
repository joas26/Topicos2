package br.unitins.topicos2.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.topicos2.model.Instrutor;
import br.unitins.topicos2.model.Perfil;
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
	
	private List<Perfil> perfis = null;

	public Instrutor getEntity() {
		if (entity == null)
			entity = new Instrutor();
		return entity;
	}

	@PostConstruct
	public void inicializar() {
		this.perfis = Arrays.asList(Perfil.values());
		
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


	public List<Perfil> getPerfis() {
		return perfis;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}

}
