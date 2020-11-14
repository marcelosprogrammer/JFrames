package br.com.projetolivraria.dao;

import br.com.projetolivraria.conexao.Conexao;
import br.com.projetolivraria.interfaces.ILivroDao;
import br.com.projetolivraria.model.Livro;
import java.sql.*;

import javax.swing.JOptionPane;

public class LivroDao extends Conexao implements ILivroDao {

	Connection con;
	Statement stmt;
	ResultSet rs;
	
	public LivroDao() {
		con = this.conectar();
	}
	
	@Override
	public void inserirLivro(Livro livro) throws Exception {
		
		if (livro != null) {
			
			stmt = con.createStatement();
			String sql = "insert into livros (id, titulo, editora, autor, ano, preco, qtdpaginas) VALUES (null,'"+livro.getTitulo()
			+"','"+livro.getEditora()+"','"+livro.getAutor()+"',"+livro.getAno()+","+livro.getPreco()+","+livro.getQtdPaginas()+")";
			
			int success = stmt.executeUpdate(sql);
			if (success == 1) {
				JOptionPane.showMessageDialog(null, "Livro: "+ livro.getTitulo()+ " Salvo","Livraria", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Livro: "+ livro.getTitulo()+ "Não Foi Salvo","Livraria", JOptionPane.ERROR_MESSAGE);
			}
			
			if(stmt != null) {
				stmt.close();
			}
			
			if (con != null) {
				con.close();
			}
			
		}
		

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
