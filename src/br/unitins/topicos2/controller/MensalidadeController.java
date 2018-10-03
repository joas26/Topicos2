package br.unitins.topicos2.controller;


import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.topicos2.model.Mensalidade;
import br.unitins.topicos2.repository.MensalidadeRepository;

@Named
@ViewScoped
public class MensalidadeController extends Controller<Mensalidade>  {

	private static final long serialVersionUID = -4270221378549569000L;

	private String pesquisa;
	

	private List<Mensalidade> listaMensalidade = null;
	
	
	public void limpar() {
		setEntity(null);
		listaMensalidade = null;
	}
	
	public void pesquisar() {
		MensalidadeRepository repository = new MensalidadeRepository(getEntityManager());
		listaMensalidade = repository.getMensalidades(pesquisa);
		
	}
	
	public List<Mensalidade> getListaMensalidade() {
		if (listaMensalidade == null)
			listaMensalidade = new ArrayList<Mensalidade>();
		
		return listaMensalidade;
	}

	public Mensalidade getEntity() {
		if (entity == null)
			entity = new Mensalidade();
		return entity;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
}