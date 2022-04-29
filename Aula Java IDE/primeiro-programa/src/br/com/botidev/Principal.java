package br.com.botidev;

import br.com.botidev.model.Carro;

public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro("Stilo","Fiat",2021);
        System.out.println(c1.getModelo());
        System.out.println(c1.getFabricante());
        System.out.println(c1.getAno());

    }
}
