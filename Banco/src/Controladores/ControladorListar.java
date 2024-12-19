/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Conexion.Conexion;
import static Conexion.Conexion.con;
import DTO.Cheque;
import com.mycompany.ninjas.modelo.persistencia.ManejoBD;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camper
 */
public abstract class ControladorListar {

    public static List<Cheque> listar() {
        ManejoBD.setConnection((Connection) Conexion.Conexionbd());
        List<Cheque> ListaCheque = new ArrayList<>();
        String sql = "SELECT id, numero_cheque, beneficiario, monto, prioridad, firma_digital, estado, razon_rechazo, cuenta_saldo_momento FROM cheques";
        List<Object> parametros = new ArrayList<>();

        try {
            ResultSet rs = ManejoBD.consultarBD(sql, parametros);
            while (rs != null && rs.next()) {
                Cheque cheque = new Cheque(
                cheque.setid(rs.getInt("id"));
                cheque.setnumero_cheque(rs.getInt("numero_cheque"));
                cheque.setbeneficiario(rs.getString("beneficiario"));
                cheque.setmonto(rs.getDouble("monto"));
                cheque.setprioridad(rs.getString("beneficiario"));
                cheque.setfirma_digital(rs.getString("beneficiario"));
                cheque.setestado(rs.getString("estado"));
                cheque.setrazon_rechazo(rs.getString("razon_rechazo"));
                cheque.setcuenta_saldo_momento(rs.getDouble("cuenta_saldo_momento"));
            
            );
            }
            ManejoBD.closeConnection(con);
        } catch  {

        }

        return ListaCheque;
    }
}
