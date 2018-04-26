package com.troqueo.ads.domain.user;

public class Address {
    public String bairro;
    public String cidade;
    public String estado;
    public String rua;
    public String numero;
    public String cep;

    public Address() {
    }

    public Address(String bairro, String cidade, String estado, String rua, String numero, String cep) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }
}
