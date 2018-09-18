/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradecesar;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class TesteCifra {

    public static void main(String[] RedHunter) {
        Random chaveRandom = new Random();
        int chave=0, opc = 1, chaveD = 1;
        
        String texto="";
        CifraDeCesar t = new CifraDeCesar();

        while (opc != 0) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma Opção"
                    + "\n 1 - criptar um texto"
                    + "\n 2 - descripta o texto"
                    + "\n 0 - Sair"));
            switch (opc) {
                case 1:
                    texto = JOptionPane.showInputDialog("Digite um texto");
                    int input = JOptionPane.showConfirmDialog(null, "Cirar chave randomicamente",
                            "Escolha uma opção", JOptionPane.YES_NO_OPTION);
                    if (input == 0) {
                        chave = chaveRandom.nextInt(10000);
                    } else {
                        chave = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para chave da criptografia"));
                    }
                    JOptionPane.showMessageDialog(null, "Texto Criptografado!");
                    break;
                case 2:
                  t.Foca(chave, chaveD, texto); 
                  JOptionPane.showMessageDialog(null, "Texto descriptografado:\n" + texto);
                    break;
                case 0:
                    break;
            }
        }

        //
        //int chaveD = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para chave da criptografia"));
        

        

    }

}
