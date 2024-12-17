package com.exemplo.veiculos;

public class Main {
    public static void main(String[] args) {
        // objeto Carro
        Carro meuCarro = new Carro("Ford Mustang", "shelby gt500", 2024);

        // Usar os métodos da classe Carro
        meuCarro.exibirInformacoes();
        meuCarro.ligar();
        meuCarro.exibirInformacoes();
        meuCarro.desligar();
        meuCarro.exibirInformacoes();
    }
}

