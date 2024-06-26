/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import model.Cliente;
import java.util.List;

public class ClienteView {
    
    public static void mostrarClientes(List<Cliente> consumidores) {
        if (consumidores.isEmpty()) {
            System.out.println("No hay consumidores disponibles.");
        } else {
            System.out.println("\n--- Lista de consumidores ---");
            for (Cliente consumidor : consumidores) {
                System.out.println(consumidor.getId() + ". " + consumidor.getNombre());
            }
        }
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
}
