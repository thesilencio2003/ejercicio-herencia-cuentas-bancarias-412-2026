package com.uniajc;

public class CuentaCorriente extends Cuenta {
    protected float sobregiro;

    public CuentaCorriente(float saldo, float tasa, float sobregiro) {
        super(saldo, tasa);
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirar(float cantidad) {
        float resultado = saldo - cantidad;
        
        if (resultado < 0) {
            sobregiro -= resultado;
            saldo = 0;
        } else {
            saldo -= cantidad;
        }
        numeroRetiros++;
     }

    @Override
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad > sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
                saldo += cantidad;
            } else {
                
                sobregiro -= cantidad;
            }
        } else {
    
            saldo += cantidad;
        }
        numeroConsignaciones++;
     }

    @Override
    public void extractoMensual() { 

        super.extractoMensual();
    }

    public void imprimir() {

        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " + comisionMensual);
        System.out.println("Número de transacciones = " + (numeroRetiros + numeroConsignaciones));
        System.out.println("Valor de sobregiro = $ " + sobregiro);
        System.out.println();
     }

}