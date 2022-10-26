import java.util.Scanner;

class Jogadores{
    private String jogador1;
    private String jogador2;
    private String jogador3;

    void getNomes(){
        Scanner nomes = new Scanner(System.in);
        System.out.println("Jogador 1, digite o seu nome: ");
        jogador1 = nomes.nextLine();

        System.out.println("Jogador 2, digite o seu nome: ");
        jogador2 = nomes.nextLine();

        System.out.println("Jogador 3, digite o seu nome: ");
        jogador3 = nomes.nextLine();


        System.out.println(jogador1+" "+jogador2+" "+jogador3);


    }
    
}