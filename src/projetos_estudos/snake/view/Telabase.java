package projetos_estudos.snake.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Telabase extends JFrame{

	public Telabase(){
		setTitle("Jogo da Cobrinha");
		setSize(640, 480);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setIconImage(new ImageIcon("res/img/icon.png").getImage());
	}

}
