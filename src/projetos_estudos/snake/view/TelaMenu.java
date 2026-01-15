package projetos_estudos.snake.view;

import java.awt.FlowLayout;

import javax.swing.JButton;

import projetos_estudos.snake.control.ControleTelaMenu;

public class TelaMenu extends Telabase{

	private JButton novoJogo;
	private JButton instrucoes;
	private JButton sair;
	private ControleTelaMenu controle;


	public TelaMenu(){

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		novoJogo = new JButton("Novo Jogo");
		instrucoes = new JButton("Instruções");
		sair = new JButton("Sair");
		add(novoJogo);
		add(instrucoes);
		add(sair);

		controle= new ControleTelaMenu(this);
		novoJogo.addActionListener(controle);
		instrucoes.addActionListener(controle);
		sair.addActionListener(controle);
		
		setVisible(true);
	}


	public JButton getNovoJogo(){
		return novoJogo;
	}


	public JButton getInstrucoes(){
		return instrucoes;
	}


	public JButton getSair(){
		return sair;
	}


}
