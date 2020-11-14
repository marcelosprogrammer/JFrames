package br.com.projetolivraria.model;

import java.io.Serializable;

import br.com.projetolivraria.conexao.Conexao;

public class Livro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3870623818075557480L;

	private int id;
	private String titulo;
	private String editora;
	private int ano;
	private String autor;
	private Double preco;
	private int qtdPaginas;

	public Livro() {

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the editora
	 */
	public String getEditora() {
		return editora;
	}

	/**
	 * @param editora the editora to set
	 */
	public void setEditora(String editora) {
		this.editora = editora;
	}

	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the preco
	 */
	public Double getPreco() {
		return preco;
	}

	/**
	 * @param preco the preco to set
	 */
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	/**
	 * @return the qtdPaginas
	 */
	public int getQtdPaginas() {
		return qtdPaginas;
	}

	/**
	 * @param qtdPaginas the qtdPaginas to set
	 */
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", editora=" + editora + ", ano=" + ano + ", autor=" + autor
				+ ", preco=" + preco + ", qtdPaginas=" + qtdPaginas + "]";
	}

	
	
	
}
