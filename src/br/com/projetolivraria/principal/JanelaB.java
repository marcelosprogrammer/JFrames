package br.com.projetolivraria.principal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.projetolivraria.model.Livro;
import br.com.projetolivraria.servicos.LivroServicos;

public class JanelaB extends JFrame {

	// Define os Elementos Labels

	private JLabel lnome;
	private JLabel ltitulo;
	private JLabel leditora;
	private JLabel lano;
	private JLabel lautor;
	private JLabel lpreco;
	private JLabel lqtdPaginas;
	private JLabel lstatus;

	// Define os Elementos os TextFields
	private JTextField tnome;
	private JTextField ttitulo;
	private JTextField teditora;
	private JTextField tano;
	private JTextField tautor;
	private JTextField tpreco;
	private JTextField tqtdPaginas;

	private JButton bsalvar;
	private JButton bpesquisar;
	private JButton bexcluir;
	private JButton batualizar;

	/**
	 * Construtor da classe JanelaB
	 */
	public JanelaB() {
		montarTela(); // chama o método montarTela, executando todos os comandos para a geração da
						// janela.
	}

	/**
	 * Método criado para definir as configurações da Janela.
	 */
	public void montarTela() {

		setTitle("Sistema Biblioteca - Livros"); // define o titulo para a Janela.
		setLayout(null); // define que não haverá um layout especifico, quando usa a opção null
		setDefaultCloseOperation(EXIT_ON_CLOSE); // fechará a aplicação ao fechar a janela.

		// adicionando o JLabel
		lnome = new JLabel("Gerenciamento de Livros");
		Font fonte = new Font("Arial", 1, 25);
		lnome.setFont(fonte);
		lnome.setBounds(10, 7, 350, 40); // define a posição dentro da janela em que ficará o elemento lnome
		// adicionando a caixa de texto
		tnome = new JTextField();
		tnome.setBounds(75, 10, 120, 30); // define a posição dentro da janela em que ficará o elemento tnome

		// setando os componentes para a janela:::::::::
		// ::::::::::::::::::::::::::::::::::::::::::::: adicionando elementos para o
		// titulo do livro
		ltitulo = new JLabel("Titulo:");
		ltitulo.setBounds(10, 50, 60, 30); // define a posição dentro da janela em que ficará o elemento ltitulo
		// adicionando a caixa de texto
		ttitulo = new JTextField();
		ttitulo.setBounds(75, 50, 300, 30); // define a posição dentro da janela em que ficará o elemento ttitulo
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		// Editora do livro
		leditora = new JLabel("Editora:");
		leditora.setBounds(10, 90, 60, 30); // define a posição dentro da janela em que ficará o elemento leditora
		// adicionando a caixa de texto
		teditora = new JTextField();
		teditora.setBounds(75, 90, 300, 30); // define a posição dentro da janela em que ficará o elemento teditora
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		// Autor do livro
		lautor = new JLabel("Autor:");
		lautor.setBounds(10, 130, 60, 30); // define a posição dentro da janela em que ficará o elemento lautor
		// adicionando a caixa de texto
		tautor = new JTextField();
		tautor.setBounds(75, 130, 300, 30); // define a posição dentro da janela em que ficará o elemento tautor
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		// Ano do livro
		lano = new JLabel("Ano:");
		lano.setBounds(10, 170, 60, 30); // define a posição dentro da janela em que ficará o elemento lpreco
		// adicionando a caixa de texto
		tano = new JTextField();
		tano.setBounds(75, 170, 100, 30); // define a posição dentro da janela em que ficará o elemento tpreco
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		// Preço do livro
		lpreco = new JLabel("Preço:");
		lpreco.setBounds(10, 210, 60, 30); // define a posição dentro da janela em que ficará o elemento lpreco
		// adicionando a caixa de texto
		tpreco = new JTextField();
		tpreco.setBounds(75, 210, 100, 30); // define a posição dentro da janela em que ficará o elemento tpreco
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		// qtdPaginas
		lqtdPaginas = new JLabel("Páginas:");
		lqtdPaginas.setBounds(10, 250, 60, 30); // define a posição dentro da janela em que ficará o elemento lpreco
		// adicionando a caixa de texto
		tqtdPaginas = new JTextField();
		tqtdPaginas.setBounds(75, 250, 100, 30); // define a posição dentro da janela em que ficará o elemento tpreco
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		// BOTÃO SALVAR
		bsalvar = new JButton("Salvar");
		bsalvar.setBounds(10, 290, 120, 40); // define a posição dentro da janela em que ficará o elemento bsalvar
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		// BOTÃO PESQUISA
		bpesquisar = new JButton("Pesquisar");
		bpesquisar.setBounds(135, 290, 120, 40); // define a posição dentro da janela em que ficará o elemento bsalvar
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		// BOTÃO EXCLUIR
		bexcluir = new JButton("Excluir");
		bexcluir.setBounds(260, 290, 120, 40); // define a posição dentro da janela em que ficará o elemento bsalvar
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		// BOTÃO ATUALIZAR
		batualizar = new JButton("Atualizar");
		batualizar.setBounds(385, 290, 120, 40); // define a posição dentro da janela em que ficará o elemento bsalvar
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		// :::::::::::::::::::::::::::::::::::::::: Status
		lstatus = new JLabel("Sistema Ativo");
		lstatus.setBounds(10, 345, 300, 30); // define a posição dentro da janela em que ficará o elemento lpreco

		// :::::::::::::::::::::::::::::::::::::::: adicionando a janela os elementos

		add(lnome); // adicionao label a janela

		add(ltitulo);
		add(ttitulo);

		add(leditora);
		add(teditora);

		add(lautor);
		add(tautor);

		add(lano);
		add(tano);

		add(lpreco);
		add(tpreco);

		add(lqtdPaginas);
		add(tqtdPaginas);

		// adicionando os botões :::
		add(bsalvar);
		add(bpesquisar);
		add(bexcluir);
		add(batualizar);

		// adicionando evento de click ao botão bsalvar
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		bsalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * aqui dentro do método actionPerformed adicionamos os comandos que queremos
				 * executar quando for clicado no botão bsalvar
				 */
				
				//Montando o objeto Livro ::::::::::::::::::::::::::::::::::::::::::::::::
				Livro livro = new Livro();
			
				livro.setTitulo(ttitulo.getText());
				livro.setEditora(teditora.getText());
				livro.setAutor(tautor.getText());
				livro.setAno(Integer.parseInt(tano.getText()));
				livro.setPreco(Double.parseDouble(tpreco.getText()));
				livro.setQtdPaginas(Integer.parseInt(tqtdPaginas.getText()));
				
				
				//chamando o serviço para inserir o livro :::::::::::::::::::::::::::::::::
				LivroServicos livroserv = new LivroServicos();
				limparFormulario();
				
				
				try {
					livroserv.inserirLivro(livro);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});

		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		// adicionando evento de click ao botão bpesquisar
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		bpesquisar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * aqui dentro do método actionPerformed adicionamos os comandos que queremos
				 * executar quando for clicado no botão bpesquisar
				 */

				JOptionPane.showMessageDialog(null, "Botão Pesquisar!");
			}
		});

		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		// adicionando evento de click ao botão bexcluir
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		bexcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * aqui dentro do método actionPerformed adicionamos os comandos que queremos
				 * executar quando for clicado no botão bexcluir
				 */

				JOptionPane.showMessageDialog(null, "Botão Excluir!");
			}
		});

		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		// adicionando evento de click ao botão batualizar
		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		batualizar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * aqui dentro do método actionPerformed adicionamos os comandos que queremos
				 * executar quando for clicado no botão batualizar
				 */

				JOptionPane.showMessageDialog(null, "Botão atualizar!");
			}
		});

		// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		setSize(530, 430); // define o tamanho da janela
		setLocationRelativeTo(null); // vai carregar a janela no centro
		setVisible(true);
	}

	/**
	 * Método main, para a execução da classe
	 */
	public static void main(String args[]) {
		new JanelaB(); // chama o construtor da classe JanelaB, criando uma nova intância ....
	}
	
	
	
	public void limparFormulario() {
		ttitulo.setText(null);
		teditora.setText(null);
		tautor.setText(null);
		tpreco.setText(null);
		tqtdPaginas.setText(null);
		tano.setText(null);
	}

}
