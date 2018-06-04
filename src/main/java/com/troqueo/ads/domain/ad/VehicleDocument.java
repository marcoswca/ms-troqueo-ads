package com.troqueo.ads.domain.ad;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleDocument {
    public boolean veiculoAdaptado;
    public boolean veiculoDeColecionador;
    public String placaDoVeiculo;
    public boolean unicoDono;
    public boolean garantiaDeFabrica;
    public boolean veiculoFinanciado;
    public boolean ipvaPago;
    public boolean revisoesNaConcessionaria;

    public VehicleDocument() {
    }

    public VehicleDocument(boolean veiculoAdaptado, boolean veiculoDeColecionador, String placaDoVeiculo, boolean unicoDono, boolean garantiaDeFabrica, boolean veiculoFinanciado, boolean ipvaPago, boolean revisoesNaConcessionaria) {
        this.veiculoAdaptado = veiculoAdaptado;
        this.veiculoDeColecionador = veiculoDeColecionador;
        this.placaDoVeiculo = placaDoVeiculo;
        this.unicoDono = unicoDono;
        this.garantiaDeFabrica = garantiaDeFabrica;
        this.veiculoFinanciado = veiculoFinanciado;
        this.ipvaPago = ipvaPago;
        this.revisoesNaConcessionaria = revisoesNaConcessionaria;
    }

    public boolean getVeiculoAdaptado() {
        return veiculoAdaptado;
    }

    public void setVeiculoAdaptado(boolean veiculoAdaptado) {
        this.veiculoAdaptado = veiculoAdaptado;
    }

    public boolean getVeiculoDeColecionador() {
        return veiculoDeColecionador;
    }

    public void setVeiculoDeColecionador(boolean veiculoDeColecionador) {
        this.veiculoDeColecionador = veiculoDeColecionador;
    }

    public String getPlacaDoVeiculo() {
        return placaDoVeiculo;
    }

    public void setPlacaDoVeiculo(String placaDoVeiculo) {
        this.placaDoVeiculo = placaDoVeiculo;
    }

    public boolean isUnicoDono() {
        return unicoDono;
    }

    public void setUnicoDono(boolean unicoDono) {
        this.unicoDono = unicoDono;
    }

    public boolean isGarantiaDeFabrica() {
        return garantiaDeFabrica;
    }

    public void setGarantiaDeFabrica(boolean garantiaDeFabrica) {
        this.garantiaDeFabrica = garantiaDeFabrica;
    }

    public boolean isVeiculoFinanciado() {
        return veiculoFinanciado;
    }

    public void setVeiculoFinanciado(boolean veiculoFinanciado) {
        this.veiculoFinanciado = veiculoFinanciado;
    }

    public boolean isIpvaPago() {
        return ipvaPago;
    }

    public void setIpvaPago(boolean ipvaPago) {
        this.ipvaPago = ipvaPago;
    }

    public boolean isRevisoesNaConcessionaria() {
        return revisoesNaConcessionaria;
    }

    public void setRevisoesNaConcessionaria(boolean revisoesNaConcessionaria) {
        this.revisoesNaConcessionaria = revisoesNaConcessionaria;
    }
}
