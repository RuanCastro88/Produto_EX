package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        System.out.println("Digite o Id do Produto");
        produto1.setIdProduto(Integer.parseInt(imput.nextLine()));
        System.out.println("Digite a Descrição do produto");
        produto1.setDescricao(imput.nextLine());
        System.out.println("Digite o valor do produto");
        produto1.setValor(Double.parseDouble(imput.nextLine()));
        System.out.println("Digite a quantidade da entrada:");
        produto1.RegistrarEntrada(Integer.parseInt(imput.nextLine()));
        System.out.println("Digite a quantidade da saída");
        produto1.RegistrarSaida(Integer.parseInt(imput.nextLine()));
        produto1.ListarProduto();

        System.out.println("Digite o Id do Produto");
        produto2.setIdProduto(Integer.parseInt(imput.nextLine()));
        System.out.println("Digite a Descrição do produto");
        produto2.setDescricao(imput.nextLine());
        System.out.println("Digite o valor do produto");
        produto2.setValor(Double.parseDouble(imput.nextLine()));
        System.out.println("Digite a quantidade da entrada:");
        produto2.RegistrarEntrada(Integer.parseInt(imput.nextLine()));
        System.out.println("Digite a quantidade da saída");
        produto2.RegistrarSaida(Integer.parseInt(imput.nextLine()));
        produto2.ListarProduto();

        System.out.println("Digite o Id do Produto");
        produto3.setIdProduto(Integer.parseInt(imput.nextLine()));
        System.out.println("Digite a Descrição do produto");
        produto3.setDescricao(imput.nextLine());
        System.out.println("Digite o valor do produto");
        produto3.setValor(Double.parseDouble(imput.nextLine()));
        System.out.println("Digite a quantidade da entrada:");
        produto3.RegistrarEntrada(Integer.parseInt(imput.nextLine()));
        System.out.println("Digite a quantidade da saída");
        produto3.RegistrarSaida(Integer.parseInt(imput.nextLine()));
        produto3.ListarProduto();
    }
}
