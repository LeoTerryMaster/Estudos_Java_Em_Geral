package DevDojo.poo.associacao.jogador.teste;



import DevDojo.poo.associacao.jogador.Jogador3;
import DevDojo.poo.associacao.jogador.Time3;

public class JogadorTeste3 {

    public static void main(String[] args) {
        Jogador3 jogador = new Jogador3("Ronaldinho");
        Jogador3[] joga = {jogador};

        Time3 time = new Time3("Selção Brasilera");
        jogador.setTime(time);
        time.setJogadores(joga);

        System.out.println("============== Jogador");
        jogador.imprimir();
        System.out.println("============== Time");
        time.imprimi();
    }
}
