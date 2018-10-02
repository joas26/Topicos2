package br.unitins.topicos2.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.topicos2.model.Equipamento;
import br.unitins.topicos2.repository.EquipamentoRepository;

@Named
@ViewScoped
public class EquipamentoController extends Controller<Equipamento> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9099224520262609199L;

	private String pesquisa;

	private List<Equipamento> listaEquipamento = null;

	@Override
	public void limpar() {
		setEntity(null);
		listaEquipamento = null;
	}

	public void pesquisar() {
		EquipamentoRepository repository = new EquipamentoRepository(getEntityManager());
		listaEquipamento = repository.getEquipamentos(pesquisa);

	}

	public List<Equipamento> getListaEquipamento() {
		if (listaEquipamento == null)
			listaEquipamento = new ArrayList<Equipamento>();

		return listaEquipamento;
	}

	public Equipamento getEntity() {
		if (entity == null)
			entity = new Equipamento();
		return entity;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
}
