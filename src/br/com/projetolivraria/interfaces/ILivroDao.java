package br.com.projetolivraria.interfaces;

import br.com.projetolivraria.model.Livro;

public interface ILivroDao {

	public void inserirLivro(Livro livro) throws Exception;

	public void excluirLivro(Livro livro) throws Exception;

	public Livro pesquisarLivro(String titulo) throws Exception;

	public void atualizarLivro(String titulo) throws Exception;

	
}
