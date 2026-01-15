package projetos_estudos.snake.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projetos_estudos.snake.view.TelaInstrucoes;

public class ControleTelaInstrucoes implements ActionListener{

	private TelaInstrucoes tela;
	
	
	
	public ControleTelaInstrucoes(TelaInstrucoes tela){
		this.tela = tela;
	}



	@Override
	public void actionPerformed(ActionEvent e){
		ControleTelaMenu.mostrarTelaMenu();
		tela.dispose();
	}
	
	

}
