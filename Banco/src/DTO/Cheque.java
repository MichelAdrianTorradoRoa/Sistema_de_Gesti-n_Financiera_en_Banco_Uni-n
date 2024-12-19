/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;

/**
 *
 * @author camper
 */
public class Cheque {

    private int id;
    private String numero_cheque;
    private String beneficiario;
    private double monto;
    private String prioridad;
    private String firma_digital;
    private String estado;
    private String razon_rechazo;
    private double cuenta_saldo_momento;
    private int id_cuenta;
    private List<Cheque> cheque;

    public Cheque(int id, String numero_cheque, String beneficiario, double monto, String prioridad, String firma_digital, String estado, String razon_rechazo, double cuenta_saldo_momento,int id_cuenta, List<Cheque> cheque) {
        this.id = id;
        this.numero_cheque = numero_cheque;
        this.beneficiario = beneficiario;
        this.monto = monto;
        this.prioridad = prioridad;
        this.firma_digital = firma_digital;
        this.estado = estado;
        this.razon_rechazo = razon_rechazo;
        this.cuenta_saldo_momento = cuenta_saldo_momento;
        this.id_cuenta= id_cuenta;
        this.cheque = cheque;
    }
    public Cheque(int id, String numero_cheque, String beneficiario, double monto, String prioridad, String firma_digital, String estado, String razon_rechazo,int id_cuenta, double cuenta_saldo_momento) {
        this.id = id;
        this.numero_cheque = numero_cheque;
        this.beneficiario = beneficiario;
        this.monto = monto;
        this.prioridad = prioridad;
        this.firma_digital = firma_digital;
        this.estado = estado;
        this.razon_rechazo = razon_rechazo;
        this.cuenta_saldo_momento = cuenta_saldo_momento;
                this.id_cuenta= id_cuenta;

        this.cheque = cheque;
    }

    public Cheque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Cheque> getCheque() {
        return cheque;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero_cheque() {
        return numero_cheque;
    }

    public void setNumero_cheque(String numero_cheque) {
        this.numero_cheque = numero_cheque;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getFirma_digital() {
        return firma_digital;
    }

    public void setFirma_digital(String firma_digital) {
        this.firma_digital = firma_digital;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRazon_rechazo() {
        return razon_rechazo;
    }

    public void setRazon_rechazo(String razon_rechazo) {
        this.razon_rechazo = razon_rechazo;
    }

    public double getCuenta_saldo_momento() {
        return cuenta_saldo_momento;
    }

    public void setCuenta_saldo_momento(double cuenta_saldo_momento) {
        this.cuenta_saldo_momento = cuenta_saldo_momento;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }
    

    public void setCheque(List<Cheque> cheque) {
        this.cheque = cheque;
    }
    
    @Override
    public String toString() {
        return "Cheque{" + "id=" + id + ", numero_cheque=" + numero_cheque + ", beneficiario=" + beneficiario + ", monto=" + monto + ", prioridad=" + prioridad +  ", firma_digital=" + firma_digital + ", estado=" + estado + ", razon_rechazo=" + razon_rechazo + ", cuenta_saldo_momento=" + cuenta_saldo_momento +'}';
    }
}
