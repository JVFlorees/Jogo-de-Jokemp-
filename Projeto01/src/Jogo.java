import java.util.Random;
import java.util.Scanner;

// JOKENPÔ
public class Jogo {
	// Placar 
	private static int placarJogador = 0;
	private static int placarComputador = 0;
	
	private static int escolhaJogador;
	private static int escolhaComputador;
	//Método Principal 
	public static void main(String[] args) {
		// Rodadas 
		int rodadas = 0;
		//int novojogo = 3;
		int reinicia = 1;
		//Input
		Scanner input = new Scanner(System.in);
		Random gerador = new Random ();
		//==========================================================================
		while (reinicia == 1){
		System.out.println("::: JOKENPÔ :::");
		System.out.println("Quantidade de rodadas: ");
		rodadas = input.nextInt();
		//===========================================================================
		for (int i = 1; i <= rodadas; ++i) {
			rotuloEscolhaJogador();
			escolhaJogador = input.nextInt();
			escolhaComputador = (gerador.nextInt(3)+1);
			 if (escolhaComputador == 1){
			  System.out.println("1 - Pedra");}
			  else if (escolhaComputador == 2){
					System.out.println("2 - Papel");}
			  else if (escolhaComputador == 3){
				  System.out.println("3 - Tesoura");}
			 
			 verificaResultado();
			 System.out.println(":::::::::::::::::::::::::::");}
			 exibeplacar(); 

			System.out.println(":::::::::::::::::::::::::::");
			System.out.println("Deseja Continuar ?");
			System.out.println("(1) SIM (2) NÃO ");
			reinicia = input.nextInt();}
		
			System.out.println("::: Perdedor kk :::");
}
	private static void exibeplacar() {
		
		if (placarComputador > placarJogador){
		System.out.println("Computador Campeão do Jogo");}
		else if (placarComputador < placarJogador){
			System.out.println("Jogador Campeão do Jogo");}
		else {
			System.out.println("Empate");}
}
	private static void verificaResultado() {
		if (escolhaJogador == escolhaComputador){
			System.out.println("Empate");}
			else if ((escolhaJogador - escolhaComputador) == -1 ||
					(escolhaJogador - escolhaComputador) == 2){
				System.out.println("Computador Venceu");placarComputador++;}
			else {
				System.out.println("Jogador Venceu");placarJogador++;}
		//Verificar quem ganhou 
		//Atribuir ponto 
		//(1)Pedra (2) Papel (3)Tesoura
		// J (1) C(2) = -1 Win Computador
		// J (1) C(3) = -2 Win Jogador
		// J (2) C(1) = 1 Win Jogador
		// J (2) C(3) = -1 Win Computador
		// J (3) C(1) = 2 Win Computador
		// J (3) C(2) = 1 Win Jogador
}
	private static void rotuloEscolhaJogador() {
		System.out.println("::: JOGADOR, DIGITE: ");
		System.out.println(":: 1 - Pedra");
		System.out.println(":: 2 - Papel");
		System.out.println(":: 3 - Tesoura");
		System.out.println(":: ESCOLHA SUA OPÇÃO:");}

}
