/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.ed.cola;

import controller.ed.listaEnlazada.ListaEnlazada;
import controller.ed.listaEnlazada.exception.EmptyException;
import controller.ed.listaEnlazada.exception.PositionException;
import controller.ed.pila.exception.TopeException;

/**
 *
 * @author JUAN
 */
public class Cola <E> extends ListaEnlazada<E>{
    private ColaI<E> colai;

    public Cola(Integer tope) {
        colai = new ColaI(tope);
    }
    
    
    public void queue(E obj)throws TopeException{
        colai.queue(obj);
    }
    
    public E dequeue() throws EmptyException,PositionException {
        return colai.dequeue();
    }
    public Integer getTope(){
        return colai.getTope();
    }
    
    public void print()throws EmptyException{
        colai.imprimir();
    }
}
