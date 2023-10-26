/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nombre_Cliente;
        String cedula_Cliente;
        int numero_Factura;
        double monto_Factura;
        int mes_Factura;
        int anio_Factura = 0;
        int estado_Factura;

        double total_Adeudado = 0;
        double interes = 0.05;
        int plazo_Mes = 6;

        System.out.print("¿Cuántas facturas desea registrar usted? ");
        int cantidadFacturas = input.nextInt();

        for (int i = 1; i <= cantidadFacturas; i++) {
            System.out.println("Factura #" + i);

            System.out.print("Ingrese el nombre del cliente: ");
            nombre_Cliente = input.next();

            System.out.print("Ingrese la cédula del cliente: ");
            cedula_Cliente = input.next();

            System.out.print("Ingrese el número de la factura: ");
            numero_Factura = input.nextInt();

            System.out.print("Ingrese el monto de la factura: ");
            monto_Factura = input.nextDouble();

            System.out.print("Ingrese el mes de la factura: ");
            mes_Factura = input.nextInt();

            System.out.print("Ingrese el año de la factura: ");
            anio_Factura = input.nextInt();

            System.out.print("Estado de la factura (1 = pagada, 2 = no pagada): ");
            estado_Factura = input.nextInt();

            if (estado_Factura == 2) {
                total_Adeudado += monto_Factura;
            }
        }

        double cuotaMensual = (total_Adeudado * interes + total_Adeudado) / plazo_Mes;

        String[] mesesAnio = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};
        int mesActual = 7;

        for (int i = 1; i <= plazo_Mes; i++) {
            System.out.println("Cuota #" + i + ": " + cuotaMensual + " Fecha de pago: " + mesesAnio[mesActual - 1] + " " + anio_Factura);

            mesActual++;

            if (mesActual > 12) {
                mesActual = 1;
                anio_Factura++;
            }
        }
    }
}
   