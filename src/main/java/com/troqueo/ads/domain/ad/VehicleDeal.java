package com.troqueo.ads.domain.ad;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleDeal {
    public BigDecimal preco;
    public boolean aceitaTroca;
    public boolean apenasVeiculoEspecifico;
    public boolean veiculoDeMaiorValor;
    public boolean veiculoDeMenorValor;
    public boolean receberAnuncio;
    public BigDecimal valorDaEntrada;
    public BigDecimal valorDoFinanciamento;
    public BigDecimal valorDaParcela;

    public VehicleDeal() {
    }

    public VehicleDeal(BigDecimal preco, boolean aceitaTroca, boolean apenasVeiculoEspecifico, boolean veiculoDeMaiorValor, boolean veiculoDeMenorValor, boolean receberAnuncio, BigDecimal valorDaEntrada, BigDecimal valorDoFinanciamento, BigDecimal valorDaParcela) {
        this.preco = preco;
        this.aceitaTroca = aceitaTroca;
        this.apenasVeiculoEspecifico = apenasVeiculoEspecifico;
        this.veiculoDeMaiorValor = veiculoDeMaiorValor;
        this.veiculoDeMenorValor = veiculoDeMenorValor;
        this.receberAnuncio = receberAnuncio;
        this.valorDaEntrada = valorDaEntrada;
        this.valorDoFinanciamento = valorDoFinanciamento;
        this.valorDaParcela = valorDaParcela;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public boolean getAceitaTroca() {
        return aceitaTroca;
    }

    public void setAceitaTroca(boolean aceitaTroca) {
        this.aceitaTroca = aceitaTroca;
    }

    public boolean getApenasVeiculoEspecifico() {
        return apenasVeiculoEspecifico;
    }

    public void setApenasVeiculoEspecifico(boolean apenasVeiculoEspecifico) {
        this.apenasVeiculoEspecifico = apenasVeiculoEspecifico;
    }

    public boolean getVeiculoDeMaiorValor() {
        return veiculoDeMaiorValor;
    }

    public void setVeiculoDeMaiorValor(boolean veiculoDeMaiorValor) {
        this.veiculoDeMaiorValor = veiculoDeMaiorValor;
    }

    public boolean getVeiculoDeMenorValor() {
        return veiculoDeMenorValor;
    }

    public void setVeiculoDeMenorValor(boolean veiculoDeMenorValor) {
        this.veiculoDeMenorValor = veiculoDeMenorValor;
    }

    public boolean getReceberAnuncio() {
        return receberAnuncio;
    }

    public void setReceberAnuncio(boolean receberAnuncio) {
        this.receberAnuncio = receberAnuncio;
    }

    public BigDecimal getValorDaEntrada() {
        return valorDaEntrada;
    }

    public void setValorDaEntrada(BigDecimal valorDaEntrada) {
        this.valorDaEntrada = valorDaEntrada;
    }

    public BigDecimal getValorDoFinanciamento() {
        return valorDoFinanciamento;
    }

    public void setValorDoFinanciamento(BigDecimal valorDoFinanciamento) {
        this.valorDoFinanciamento = valorDoFinanciamento;
    }

    public BigDecimal getValorDaParcela() {
        return valorDaParcela;
    }

    public void setValorDaParcela(BigDecimal valorDaParcela) {
        this.valorDaParcela = valorDaParcela;
    }
}
