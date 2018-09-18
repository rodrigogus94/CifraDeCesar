/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradecesar;

/**
 *
 * @author Administrador
 */
public class CifraDeCesar {

   public String encriptar(int chave, String texto){
       StringBuilder textoC = new StringBuilder();
       int tamanhoTexto = texto.length();
       for(int i=0; i < tamanhoTexto; i++){
           int letraCriptada = ((int) texto.charAt(i))+ chave;
           
           while(letraCriptada > 126){
               letraCriptada -= 94;  
           }
           textoC.append((char)letraCriptada);
       }
       return textoC.toString();
   }
   
   public String decriptar(int chave, String textoCriptografado  ){
       StringBuilder textoD = new StringBuilder();
       int tamanhoTeD = textoCriptografado.length();
       
       for(int i =0; i < tamanhoTeD ; i++){
           int letraDecriptografada = ((int)textoCriptografado.charAt(i)) - chave;
           
           
           while(letraDecriptografada < 32){
               letraDecriptografada += 94;
           }
           
           textoD.append((char)letraDecriptografada);
       }
       
       return textoD.toString();
   }
    public String Foca(int chave, int chaveD,String texto){
        
        int cont =0;
        while (chaveD <= chave) {
           
            
            System.err.println("Tentativas de Descriptografar a senha:\n " + encriptar(chaveD, texto));
            System.err.println("Senhas geradas" + cont );
            cont++;

            if (chaveD == chave) {
                System.err.println("*************************************************");
                System.err.println("chave certa");
                System.err.println("Texto Criptografada: " + encriptar(chave, texto));
                System.err.println("Texto Decriptografada: " + decriptar(chave, encriptar(chaveD, texto)));
                System.err.println("Tentativas de combinações de chaves: " + chaveD );
                
                
            }

            chaveD++;
        }
        return texto;
        
    }
    
    public String Foca(String textoCriptado){
        
    }
}
