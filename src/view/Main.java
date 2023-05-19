/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SucursalController;
import controller.ed.cola.Cola;
import controller.ed.listaEnlazada.ListaEnlazada;
import controller.ed.listaEnlazada.exception.EmptyException;
import controller.ed.listaEnlazada.exception.PositionException;
import controller.ed.pila.Pila;
import controller.util.Utilities;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Sucursal;

/**
 *
 * @author JUAN
 */
public class Main {

    public static void main(String[] args) {
        Pila <Integer> pila = new Pila(5);
        Cola <Integer> cola = new Cola(5);
        try {
            pila.push(5);
            pila.push(45);
            pila.push(12);
            pila.print();
            System.out.println("-------------cola----------");
            cola.queue(3);
            cola.queue(53);
            cola.queue(73);
            cola.print();
            
        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
