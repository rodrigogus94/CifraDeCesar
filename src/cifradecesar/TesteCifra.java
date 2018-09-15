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

    public static void main(String[] args) {
        Random chaveRandom = new Random();
        CifraDeCesar t = new CifraDeCesar();
        String texto = JOptionPane.showInputDialog("Digite um texto" );
        
        
        //int chave = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para chave da criptografia"));
        //int chaveD = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para chave da criptografia"));
        
        int chave = chaveRandom.nextInt(10000);
        int chaveD = 1;

        
        t.Foca(chave, chaveD, texto);
       
    }

}
