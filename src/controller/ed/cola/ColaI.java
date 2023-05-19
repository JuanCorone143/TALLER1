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
public class ColaI <E> extends ListaEnlazada<E>{
    
    private Integer tope;

    public ColaI(Integer tope) {
        this.tope = tope;
    }

    public void setTope(Integer tope) {
        this.tope = tope;
    }
    public Boolean isFull(){
        return (size() >= tope );
    }
    public void queue(E dato )throws TopeException{
        if(isFull())
            throw new TopeException("cola sin espacio");
        else this.insertar(dato);
    }
    
    public E dequeue() throws EmptyException,PositionException {
        E dato = null;
        if(isEmpty()){
            throw new EmptyException("cola vacia");
        } else {
            return this.delete(0);
        }
    }
    
    public Integer getTope() {
        return tope;
    }        
}
