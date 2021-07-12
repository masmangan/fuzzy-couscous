// Direitos Autorais, PUCRS/Escola Politécnica

import java.util.Scanner;

/**
 * A classe MainApp permite jogar uma partida de xadrez.
 * 
 * Jogo da Velha
 * https://github.com/masmangan/symmetrical-octo-spoon
 * 
 * @author Marco Mangan 
 * @version 1.0
 */
public class MainApp
{
    /**
     * Rotina principal de um aplicativo para
     * jogar xadrez.
     * 
     * @param args não utilizado
     */
    public static void main(String[] args)
    {
        String[][] board;
        Scanner teclado;
        String player;
        int row;
        int column;
        
        // TODO utilizar branco e preto do jogo de xadrez
        player = "x";

        teclado = new Scanner(System.in);        
        board = Auxiliar.init();    
        
        System.out.printf("Xadrez!\n\n");

        while (!Auxiliar.fimDeJogo(board))
        {
            Auxiliar.dump(board);
            
            System.out.printf("Jogada de: %s\n", player);
            System.out.print("Informe o valor da linha (0..7): ");
            row = teclado.nextInt();
            while (!(row >= 0 && row <= 7))
            {
                System.out.print("\tValor inválido. Digite novamente: ");
                row = teclado.nextInt();
            }
            // garantia: row >= 0 && row <= 7
            System.out.print("Informe o valor da coluna (0..7): ");
            column = teclado.nextInt();
            while (!(column >= 0 && column <= 7))
            {
                System.out.print("\tValor inválido. Digite novamente: ");
                column = teclado.nextInt();
            }
            // o peão avança
            if (board[row][column] == "P") 
            {
                board[row][column] = " ";
                board[row + 1][column] = "P";
            }
            else
            {
                if (board[row][column] == "p") 
                {
                    board[row][column] = " ";
                    board[row - 1][column] = "p";
                }
            }
            
            if (player.equals("x"))
            {
                player = "o";
            } 
            else 
            {
                player = "x";        
            }            
        }
        teclado.close();
        Auxiliar.dump(board);
        System.out.print("**Fim de jogo**\n");        
    }
}
