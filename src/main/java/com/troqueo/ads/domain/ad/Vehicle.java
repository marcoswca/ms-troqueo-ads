package com.troqueo.ads.domain.ad;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Vehicle {
    public String cor;
    public String descricao;
    public String controleDeTracao;
    public boolean blindado;
    public Integer capacidadeDeCarga;
    public String tracao;
    public String marcaDoMotor;
    public String dimensaoDoPneu;
    public Integer anoFabricacao;
    public Integer anoModelo;
    public Integer numeroDePortas;
    public Integer kmRodados;
    public Integer potencia;
    public String carroceria;
    public String tipoCombustivel;
    public String cambio;
    public String sistemaDeFreio;
    public List<Generic> opcionais;
    public List<Generic> seguranca;
    public List<Generic> exterior;
    public List<Generic> som;
    public Generic marca;
    public Generic versao;
    public Integer cilindrada;
    public String tipo;
    public String nome;

    public Generic getMarca() {
        return marca;
    }

    public void setMarca(Generic marca) {
        this.marca = marca;
    }

    public Generic getVersao() {
        return versao;
    }

    public void setVersao(Generic versao) {
        this.versao = versao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getControleDeTracao() {
        return controleDeTracao;
    }

    public void setControleDeTracao(String controleDeTracao) {
        this.controleDeTracao = controleDeTracao;
    }

    public boolean getBlindado() {
        return blindado;
    }

    public void setBlindado(boolean blindado) {
        this.blindado = blindado;
    }

    public Integer getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(Integer capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    public String getMarcaDoMotor() {
        return marcaDoMotor;
    }

    public void setMarcaDoMotor(String marcaDoMotor) {
        this.marcaDoMotor = marcaDoMotor;
    }

    public String getDimensaoDoPneu() {
        return dimensaoDoPneu;
    }

    public void setDimensaoDoPneu(String dimensaoDoPneu) {
        this.dimensaoDoPneu = dimensaoDoPneu;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public Integer getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(Integer kmRodados) {
        this.kmRodados = kmRodados;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getSistemaDeFreio() {
        return sistemaDeFreio;
    }

    public void setSistemaDeFreio(String sistemaDeFreio) {
        this.sistemaDeFreio = sistemaDeFreio;
    }

    public List<Generic> getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(List<Generic> opcionais) {
        this.opcionais = opcionais;
    }

    public List<Generic> getSeguranca() {
        return seguranca;
    }

    public void setSeguranca(List<Generic> seguranca) {
        this.seguranca = seguranca;
    }

    public List<Generic> getExterior() {
        return exterior;
    }

    public void setExterior(List<Generic> exterior) {
        this.exterior = exterior;
    }

    public List<Generic> getSom() {
        return som;
    }

    public void setSom(List<Generic> som) {
        this.som = som;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vehicle(){

    }

    public Vehicle(String cor, String descricao, String controleDeTracao, boolean blindado, Integer capacidadeDeCarga, String tracao, String marcaDoMotor, String dimensaoDoPneu, Integer anoFabricacao, Integer anoModelo, Integer numeroDePortas, Integer kmRodados, Integer potencia, String carroceria, String tipoCombustivel, String cambio, String sistemaDeFreio, Integer cilindrada, String tipo, String nome) {
        this.cor = cor;
        this.descricao = descricao;
        this.controleDeTracao = controleDeTracao;
        this.blindado = blindado;
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.tracao = tracao;
        this.marcaDoMotor = marcaDoMotor;
        this.dimensaoDoPneu = dimensaoDoPneu;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.numeroDePortas = numeroDePortas;
        this.kmRodados = kmRodados;
        this.potencia = potencia;
        this.carroceria = carroceria;
        this.tipoCombustivel = tipoCombustivel;
        this.cambio = cambio;
        this.sistemaDeFreio = sistemaDeFreio;
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.nome = nome;
    }
}
