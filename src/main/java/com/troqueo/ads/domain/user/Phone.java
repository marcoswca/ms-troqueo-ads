package com.troqueo.ads.domain.user;

public class Phone {
    public String numero;
    public boolean whatsApp;

    public Phone(String numero, boolean whatsApp) {
        this.numero = numero;
        if(!whatsApp)
            this.whatsApp=false;
        else
            this.whatsApp = whatsApp;
    }

    public Phone() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isWhatsApp() {
        return whatsApp;
    }

    public void setWhatsApp(boolean whatsApp) {
        this.whatsApp = whatsApp;
    }
}
