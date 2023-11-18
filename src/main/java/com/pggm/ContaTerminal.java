package com.pggm;

import com.pggm.conta.Conta;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Por favor, digite o número da Agência !");
        conta.setAgencia(input.nextLine());
        System.out.println("Por favor, digite o número da conta !");
        conta.setNumero(Integer.parseInt(input.nextLine()));
        System.out.println("Por favor, digite seu nome !");
        conta.setNomeCliente(input.nextLine());
        System.out.println("Por favor, digite seu saldo !");
        conta.setSaldo(input.nextBigDecimal());
        input.close();

        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                conta.getNomeCliente(),
                conta.getAgencia(),
                conta.getNumero(),
                conta.getSaldo())
        );
    }
}