/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author jasel
 */
public class Tarea6EDClase {
    public static final int DESCUENTO_CANTIDAD = 5;
    public static final double DESCUENTO_MENOR = 0.95;
    public static final double DESCUENTO_MAYOR = 0.8;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        if (numProductos > 3) {
            precioProducto -= DESCUENTO_CANTIDAD;
        }
        if (numProductos > 5) {
            calcularTotal(precioProducto, DESCUENTO_MAYOR, numProductos);
        } else {
            calcularTotal(precioProducto, DESCUENTO_MENOR, numProductos);

        }

    }

    public void calcularTotal(double precioProducto, double descuento, int numProductos) {
        double totalPagar;
        totalPagar = precioProducto * descuento * numProductos;
        System.out.println("El total a pagar es:" + totalPagar);
        System.out.println("Enviado");
    }
    
   
}


