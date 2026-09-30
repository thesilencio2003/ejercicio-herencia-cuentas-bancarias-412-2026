package com.uniajc;

public class CuentaAhorros extends Cuenta {

    protected boolean activa;

    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);

        if (saldo >= 10000) {
            activa = true;
        } else {
            activa = false;
        }
    }

    @Override
    public void retirar(float cantidad) {

        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("La cuenta está inactiva.");
        }
    }

    @Override
    public void consignar(float cantidad) {

        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("La cuenta está inactiva.");
        }
    }

    @Override
    public void extractoMensual() {

        if (numeroRetiros > 4) {
            comisionMensual = (numeroRetiros - 4) * 1000;
        }

        super.extractoMensual();

        if (saldo >= 10000) {
            activa = true;
        } else {
            activa = false;
        }
    }

    @Override
    public void imprimir() {

        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " + comisionMensual);
        System.out.println("Número de transacciones = "
                + (numeroConsignaciones + numeroRetiros));
        System.out.println("Cuenta activa = " + activa);
        System.out.println();
    }
}