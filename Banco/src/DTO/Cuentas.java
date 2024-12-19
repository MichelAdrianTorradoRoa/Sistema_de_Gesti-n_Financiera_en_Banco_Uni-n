/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author camper
 */
public class Cuentas {
    private int id;
    private String tipo;
    private double saldo;
    private double limite_saldo;
    private String estado;
    private int id_cliente;

    public int getId() {
        return id;
    }

    public Cuentas(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite_saldo() {
        return limite_saldo;
    }

    public void setLimite_saldo(double limite_saldo) {
        this.limite_saldo = limite_saldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    

    public Cuentas(int id, String tipo, double saldo, double limite_saldo, String estado) {
        this.id = id;
        this.tipo = tipo;
        this.saldo = saldo;
        this.limite_saldo = limite_saldo;
        this.estado = estado;
    }
}
