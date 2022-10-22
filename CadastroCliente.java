/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrocliente;

import java.util.Scanner;

public class CadastroCliente {
        String nomeCliente;
        int idade;
        String numeroCPF;
        float rendaMensal;
        String enderecoCliente;
        String escolaridadeDoUsuario;
        
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome completo: "); //informar ao usuário seu nome completo
        String nome = entradaDados.nextLine();
        
        System.out.println("Olá, " + nome + ", seja bem-vindo(a)!!! Vamos dar prosseguimento ao seu cadastro em nosso sistema do banco Lucre Mais"); //imprimir uma mensagem de boas vindas para dar prosseguimento ao cadastro
        System.out.println("Digite sua idade: "); //digitar a idade do usuário
        String idade = entradaDados.nextLine();
        
        System.out.println("Por favor, digite seu CPF: "); //digitar o número de CPF do usuário
        String numeroCPF = entradaDados.nextLine();
        
        System.out.println("Digite sua renda mensal per capita: "); //informar a renda mensal per capita familiar
        String rendaMensal = entradaDados.nextLine();
        
        System.out.println("Digite seu endereço completo, contendo número, complemento e bairro onde reside: ");
        String enderecoCliente = entradaDados.nextLine();
        
        System.out.println("Qual o seu grau de escolaridade? ");
        System.out.println("1 - Ensino Fundamental Incompleto");
        System.out.println("2 - Ensino Fundamental Completp");
        System.out.println("3 - Ensino Médio Incompleto");
        System.out.println("4 - Ensino Médio Completo");
        System.out.println("5 - Ensino Superior Incompleto");
        System.out.println("6 - Ensino Superior Completo");
        String escolariadeDoUsuario = entradaDados.nextLine();
        
        System.out.println("Por favor, confirme seus dados antes de enviar: ");
        System.out.println("Seu nome completo: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu CPF é: " + numeroCPF);
        System.out.println("Sua renda mensal per capita é: " + rendaMensal);
        System.out.println("Endereço Completo: " + enderecoCliente);
        System.out.println("Seu grau de escolaridade é: " + escolariadeDoUsuario);
        
    }
    
}
