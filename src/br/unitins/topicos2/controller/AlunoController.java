package br.unitins.topicos2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.topicos2.model.Aluno;
import br.unitins.topicos2.repository.AlunoRepository;
import br.unitins.topicos2.repository.PessoaRepository;

@Named
@ViewScoped
public class AlunoController extends Controller<Aluno> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3780741359637379099L;

	
	private String pesquisa;

	private List<Aluno> listaAluno = null;
	
	@Override
	public Aluno getEntity() {
		
		if (entity == null)
			entity = new Aluno();
		return entity;
	}
	
	@Override
	public void limpar() {
		setEntity(null);
		listaAluno = null;
	}
	
	public void pesquisar() {
		AlunoRepository repository = new AlunoRepository(getEntityManager());
		listaAluno = repository.getAlunos(pesquisa);
		
	}
	
	public List<Aluno> getListaAluno() {
		if (listaAluno == null)
			listaAluno = new ArrayList<Aluno>();
		
		return listaAluno;
	}


	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}

}
