package br.com.projetolivraria.tablemodels;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import br.com.projetolivraria.model.*;

public class LivroTableModel extends AbstractTableModel {

	private static final int COL_ID = 0;
	private static final int COL_TITULO = 1;
	private static final int COL_EDITORA = 2;
	private static final int COL_AUTOR = 3;
	private static final int COL_ANO = 4;
	private static final int COL_PRECO = 5;
	private static final int COL_QTD = 6;

	List<Livro> linhas;
	private String[] colunas = new String[] { "Id", "titulo", "editora", "autor", "ano", "preco", "qtdpaginas" };

	public LivroTableModel(List<Livro> livros) {
		this.linhas = new ArrayList<>(livros);
	}

	public int getRowCount() {
		return linhas.size();
	}

	public int getColumnCount() {
		return colunas.length;
	}

	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}

	public Class getColumnClass(int columnIndex) {
		if (columnIndex == COL_ID) {
			return Integer.class;
		}
		return String.class;
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	public Object getValueAt(int row, int column) {

		Livro m = linhas.get(row);

		if (column == COL_ID) {
			return m.getId();
		} else if (column == COL_TITULO) {
			return m.getTitulo();
		} else if (column == COL_EDITORA) {
			return m.getEditora();
		} else if (column == COL_AUTOR) {
			return m.getAutor();
		} else if (column == COL_ANO) {
			return m.getAno();
		} else if (column == COL_PRECO) {
			return m.getPreco();
		} else if (column == COL_QTD) {
			return m.getQtdPaginas();
		}
		return "";
	}

	public void setValueAt(Object aValue, int row, int column) {
		Livro u = linhas.get(row);
		if (column == COL_ID) {
			u.setId((Integer) aValue);
		} else if (column == COL_TITULO) {
			u.setTitulo(aValue.toString());
		} else if (column == COL_EDITORA) {
			u.setEditora(aValue.toString());
		} else if (column == COL_AUTOR) {
			u.setAutor(aValue.toString());
		} else if (column == COL_ANO) {
			u.setAno(Integer.parseInt(aValue.toString()));
		}
	}

	public Livro getContato(int indiceLinha) {
		return linhas.get(indiceLinha);
	}

	public void addLivro(Livro livro) {
		linhas.add(livro);
		int ultimoIndice = getRowCount() - 1;
		fireTableRowsInserted(ultimoIndice, ultimoIndice);

	}

	public void updateLivro(int indiceLinha, Livro marca) {
		linhas.set(indiceLinha, marca);
		fireTableRowsUpdated(indiceLinha, indiceLinha);

	}

	public void removeLivro(int indiceLinha) {
		linhas.remove(indiceLinha);
		fireTableRowsDeleted(indiceLinha, indiceLinha);

	}
}