package collections.chatGptExercicio1;

import java.util.Date;

import praticaUtil.ClassePadrao;

public class Tarefa extends ClassePadrao {

	private String titulo;
	private String descricao;
	private Date dataPrevista;
	private Date dataCriacao;

	public Tarefa(String titulo, String descricao, Date dataPrevista) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataPrevista = dataPrevista;
		this.dataCriacao = new Date();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataPrevista() {
		return dataPrevista;
	}

	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	@Override
	public String toString() {
	    return "Tarefa " + getId() +
	            ",\n- Titulo: '" + titulo + '\'' +
	            ",\n- Descrição: '" + descricao + '\'' +
	            ",\n- Data Prevista: " + dataPrevista +
	            ",\n- Data Criacao: " + dataCriacao + ".";
	}	
}
