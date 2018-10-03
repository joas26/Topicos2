package br.unitins.topicos2.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.topicos2.model.Aluno;
import br.unitins.topicos2.model.Perfil;
import br.unitins.topicos2.model.Sexo;
import br.unitins.topicos2.repository.AlunoRepository;


@Named
@ViewScoped
public class AlunoController extends Controller<Aluno> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3780741359637379099L;

	
	private String pesquisa;

	private List<Aluno> listaAluno = null;
	
	private List<Aluno> listaNomeAluno = null;
	
	private List<Sexo> sexos = null;
	
	@Override
	public Aluno getEntity() {
		
		if (entity == null)
			entity = new Aluno();
		return entity;
	}
	
	public List<Sexo> getSexos() {
		return sexos;
	}

	public void setSexos(List<Sexo> sexos) {
		this.sexos = sexos;
	}

	@Override
	public void limpar() {
		setEntity(null);
		listaAluno = null;
	}
	
	@PostConstruct
	public void inicializar() {
		this.sexos = Arrays.asList(Sexo.values());
		
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
