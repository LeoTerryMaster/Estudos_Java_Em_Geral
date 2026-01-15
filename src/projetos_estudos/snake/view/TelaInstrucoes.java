package projetos_estudos.snake.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import projetos_estudos.snake.control.ControleTelaInstrucoes;

public class TelaInstrucoes extends Telabase{

	private JButton voltar;
	private ControleTelaInstrucoes contrle;
	
	public TelaInstrucoes(){
		
		JLabel lb1 = new JLabel("Instruções");
		lb1.setBounds(12,12,104,15);

		
		JLabel lb2 = new JLabel("Faça a cobrinha comer as sílabas corretas para formar a palavra.");
		lb2.setBounds(12,29,522,38);
		
		JLabel lb3 = new JLabel("Faça a cobrinha comer as sílabas corretas para formar a palavra.");
		lb3.setBounds(12,112,93,15);
		
		
		JLabel lb4 = new JLabel("Mova a cobrinha utilizando as setas do teclado");
		lb4.setBounds(12,213,351,15);
		
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("res/img/setas.png"));
		img.setBounds(362, 131, 260,180);
		
		
		voltar = new JButton("Voltar");
		voltar.setBounds(483,366,120,25);
		
		contrle= new ControleTelaInstrucoes(this);
		voltar.addActionListener(contrle);
		
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(img);
		add(voltar);
		
		setVisible(true);
		
	}

	
	public JButton getVoltar(){
		return voltar;
	}
	
	
	
	
	
}
