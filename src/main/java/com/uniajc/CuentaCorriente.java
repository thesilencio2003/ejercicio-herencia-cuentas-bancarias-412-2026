package com.uniajc;

public class CuentaCorriente extends Cuenta {
    protected float sobregiro;

    public CuentaCorriente(float saldo, float tasa, float sobregiro) {
        super(saldo, tasa);
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirar(float cantidad) { }

    @Override
    public void consignar(float cantidad) { }

    @Override
    public void extractoMensual() { }

    public void imprimir() { }

}