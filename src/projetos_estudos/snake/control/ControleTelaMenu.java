package projetos_estudos.snake.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projetos_estudos.snake.view.TelaInstrucoes;
import projetos_estudos.snake.view.TelaMenu;

public class ControleTelaMenu implements ActionListener{


	private static TelaMenu tela;

	public ControleTelaMenu(TelaMenu tela){
		ControleTelaMenu.tela = tela;
	}

	public static void mostrarTelaMenu(){
		tela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == tela.getNovoJogo()){

		}else if(e.getSource() == tela.getInstrucoes()){
			new TelaInstrucoes();
			tela.setVisible(false);
		}else if(e.getSource() == tela.getSair()){
			System.exit(0);
		}

	}

}
