/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author alunos
 */
public class ClienteUrbano extends Cliente {
    
    public ClienteUrbano(String nome, String endereco, double qtdaguaconsumida, double qtdesgotoproduzido){
        this.nome = nome;
        this. endereco = endereco;
        this.qtdaguaconsumida = qtdaguaconsumida;
        this.qtdesgotoproduzido = qtdesgotoproduzido;
    }
    
    @Override
    public void calcularValorConta(){
        valorconta = (qtdaguaconsumida + qtdesgotoproduzido) * 3.5;
    }
    
    double taxa;
    
    @Override
    public double aplicarAliquota(){
        if(qtdaguaconsumida <= 20){
            taxa = valorconta * 0.03;
            valorconta = valorconta + taxa;
        }else {
            taxa = valorconta * 0.15;
            valorconta = valorconta + taxa;
        }return valorconta;
    }
    
}
