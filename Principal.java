/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

/**
 *
 * @author alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente[] cliente = new Cliente[4];
        
        cliente[0] = new ClienteRural("Maria da Silva", "Rua Seila, 10 - Mogi das Cruzes", 220, 240);
        cliente[1] = new ClienteRural("Mara dos Santos", "Rua SemNome, 20 - Mogi das Cruzes", 20, 5);
        
        cliente[2] = new ClienteUrbano("José da Silva", "Rua SemFim, 30 - Mogi das Cruzes", 30, 35);
        cliente[3] = new ClienteUrbano("João dos Santos", "Rua SemComeço, 40 - Mogi das Cruzes", 10, 5);
   
        for(Cliente teste : cliente){
            teste.calcularValorConta();
            teste.aplicarAliquota();
            System.out.println(teste.getNome() + " Pagará um total de: " + teste.getValorConta());
        }
    
    
    }
    
    
    
}
