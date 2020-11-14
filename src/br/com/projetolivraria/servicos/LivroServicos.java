package br.com.projetolivraria.servicos;

import br.com.projetolivraria.interfaces.ILivroDao;
import br.com.projetolivraria.model.Livro;
import br.com.projetolivraria.dao.LivroDao;

public class LivroServicos implements ILivroDao {

	@Override
	public void inserirLivro(Livro livro) throws Exception {
		LivroDao dao = new LivroDao();
		dao.inserirLivro(livro);
	}

	@Override
	public void excluirLivro(Livro livro) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Livro pesquisarLivro(String titulo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarLivro(String titulo) throws Exception {
		// TODO Auto-generated method stub

	}

}
