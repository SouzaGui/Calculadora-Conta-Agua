/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author alunos
 */
public class ClienteRural extends Cliente {
    
    public ClienteRural(String nome, String endereco, double qtdaguaconsumida, double qtdesgotoproduzido){
        this.nome = nome;
        this. endereco = endereco;
        this.qtdaguaconsumida = qtdaguaconsumida;
        this.qtdesgotoproduzido = qtdesgotoproduzido;
    }
    
    @Override
    public void calcularValorConta(){
        valorconta = (qtdaguaconsumida + qtdesgotoproduzido) * 2.5;
        
    }
    
    @Override
    public double aplicarAliquota(){
        double desconto;
        if(qtdesgotoproduzido <= 200){
            desconto = valorconta * 0.1;
            valorconta = valorconta - desconto;
        }else{
            desconto = valorconta * 0.05;
            valorconta = valorconta - desconto;
        }return valorconta;
    }
}
