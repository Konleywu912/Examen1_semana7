/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_semana7;

import javax.swing.JOptionPane;

/**
 *
 * @author leymanwu
 */
public class Examen1_Semana7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int puntos = 0;
        int total = 0;

        cliente persona1 = new cliente("Julio_Sanchez", 11202000, 2351, 1, 0, 0, 6, 20000);
        cliente persona2 = new cliente("Ramon_Sanchez", 11202001, 2546, 1, 3, 0, 0, 35000);
        cliente persona3 = new cliente("Julio_Valdez", 11202002, 2700, 1, 0, 2, 0, 60000);
        cliente persona4 = new cliente("Natalia_Monge", 11202003, 2810, 3, 2, 2, 1, 25000);
        cliente persona5 = new cliente("Jimena_Pereira", 11202004, 2912, 2, 1, 2, 0, 40000);

        String n = JOptionPane.showInputDialog("Digite nombre y apellido");
        String carnet = JOptionPane.showInputDialog("Digite su numero de carnet ");
        String mes = JOptionPane.showInputDialog("Digite el mes de la factura");
        String veh = JOptionPane.showInputDialog("¿Tiene vehiculo personal? (si/no");
        String sucursal = JOptionPane.showInputDialog("Digite en que sucursal trabaja");

        //calculos
        int resultado = puntos + 8;
        int bon = persona1.getMonto() + persona2.getMonto() + persona3.getMonto() + persona4.getMonto() + persona5.getMonto();
        double mu = bon * 00.29;

        //Se imprime los resultados
        System.out.println("El agente vendedor " + n + " codigo" + carnet + " en el mes de " + mes);
        System.out.println("Vendio un tota de " + bon + " en facturas");
        System.out.println("Obtuvo un total en comisiones de " + mu);
        System.out.println("El agente vendedor " + "no" + " logro el objetivo al BONO EXTRA");
        System.out.println("Puntos obtenidos por el vendedor " + resultado);
        System.out.println("El agente vendedor " + veh + " cuenta con vehiculo personal");
        System.out.println("Sucursal: " + sucursal);

    }

}
