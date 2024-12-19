/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import DAO.Deposito;
import DAO.CuentaEmpresarial;
import Controladores.ControladorCliente;
import java.util.Scanner;
import Controladores.ControladorListar;

/**
 *
 * @author camper
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Bienvenido al Sistema de Gestion Financiera del Banco Union");
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. Listar una lista de los cheques");
            System.out.println("2. Crear una cuenta personal");
            System.out.println("3. Crear una cuenta empresarial");
            System.out.println("4. Hacer un deposito");
            System.out.println("5. Hacer un retiro");
            System.out.println("6. Hacer un cheque");
            System.out.println("7. Cambiar estado");
            System.out.println("8. Cliente Nuevo");
            System.out.println("9. Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    ConroladorListar.listar().forEach(System.out::println);
                    break;
                case 2:
                    Controlador.CuentaPersonal
                break:
                case 3:
                    CuentaEmpresarial
                break;
                case 4:
                    Deposito
                break;
                case 5:
                    Controlador.Retiro
                break;
                case 6:
                    Controlador.Cheque
                break;
                case 7:
                    Controlador.Estado
                break;
                case 8:
                    ControladorCliente.insertarCliente(teclado)
                break;
                default:
                    System.out.println("Codigo en el error");
            }
        } while (opcion != 9);
    }
}
