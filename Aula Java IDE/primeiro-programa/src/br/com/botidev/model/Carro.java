package br.com.botidev.model;

public class Carro {
    private String modelo;
    private String fabricante;
    private Integer ano;

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public Integer getAno() {
        return ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Carro(String modelo, String fabricante, Integer ano) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", ano=" + ano +
                '}';
    }
}
