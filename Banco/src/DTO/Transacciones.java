/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author camper
 */
public class Transacciones {
    private int id;
    private int id_cuenta;
    private String tipo;
    private double monto;
    private String referencia;
    private double saldo_anterior;
    private double saldo_nuevo;
    private String estado;

    public Transacciones(int id, int id_cuenta, String tipo, double monto, String referencia, double saldo_anterior, double saldo_nuevo, String estado) {
        this.id = id;
        this.id_cuenta = id_cuenta;
        this.tipo = tipo;
        this.monto = monto;
        this.referencia = referencia;
        this.saldo_anterior = saldo_anterior;
        this.saldo_nuevo = saldo_nuevo;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getSaldo_anterior() {
        return saldo_anterior;
    }

    public void setSaldo_anterior(double saldo_anterior) {
        this.saldo_anterior = saldo_anterior;
    }

    public double getSaldo_nuevo() {
        return saldo_nuevo;
    }

    public void setSaldo_nuevo(double saldo_nuevo) {
        this.saldo_nuevo = saldo_nuevo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
