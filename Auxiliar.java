// Direitos Autorais, PUCRS/Escola Politécnica

/**
 * A classe Auxiliar oferece subprograma que permitem jogar 
 * uma partida de xadrez.
 * 
 * @author Marco Mangan 
 * @version 1.0
 */
public class Auxiliar
{
    /**
     * Cria uma matriz 8x8, preenchida com espaços.
     * 
     * @return a matriz criada
     */
    public static String[][] init()
    {
        int i;
        int j;
        String[][] board = new String[8][8];
        // TODO: preencher as linhas 0 e 7 com:
        // TCBXRBCT
        // tcbrxbct
        for(i = 0; i < 8; i = i + 1) // i = 0, 1, 2.., 8
        {
            for(j = 0; j < 8; j = j + 1) // j = 0, 1, 2.., 8
            {
                if (i == 1)
                {
                    board[i][j] = "P"; 
                }
                else
                if (i == 6)
                {
                    board[i][j] = "p"; 
                }
                else
                {
                    board[i][j] = " ";
                }
            }
        }    
        return board;
    }    

    /**
     * Mostra o tabuleiro do jogo
     * 
     * @param board o tabuleiro do jogo
     */
    public static void dump(String[][] board)
    {
        int i;
        int j;
        // TODO: permitir entrada com letras
        //System.out.println("  abcdefgh");
        //System.out.println("  12345678");
        System.out.println("  01234567");
        
        // TODO: para o usuário, a primeira linha deve ser 8
        // e desce de 7 até 1, conforme Wikipédia
        for(i = 0; i < 8; i = i + 1) // i = 0, 1, 2
        {
            System.out.print(i);
            System.out.print("|");
            for(j = 0; j < 8; j = j + 1) // j = 0, 1, 2
            {
                System.out.print(board[i][j]);
            }
            System.out.println("|");
        }        
    } 
    
    /**
     * Verifica se o jogo acabou.
     * 
     * @param board a situação atual do tabuleiro
     * @return true se o jogo acabou
     */
    public static boolean fimDeJogo(String[][] board)
    {        
        // TODO: determinar cheque-mate ou ciclo de jogadas
        return false;
    }    
}
