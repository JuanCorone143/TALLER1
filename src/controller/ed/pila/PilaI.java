/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.ed.pila;

import controller.ed.listaEnlazada.ListaEnlazada;
import controller.ed.listaEnlazada.exception.EmptyException;
import controller.ed.listaEnlazada.exception.PositionException;
import controller.ed.pila.exception.TopeException;

/**
 *
 * @author JUAN
 */
public class PilaI <E> extends ListaEnlazada<E>{
    private Integer cima;
    
    public PilaI(Integer cima){
        this.cima = cima;
    }
    
    public Boolean isFull(){
        return(size()>= getCima());
    }
    
    public void push(E info) throws TopeException{
        if(!isFull()){
            insertarInicio(info);
        }else
            throw new TopeException();
    }
    
    public E pop() throws EmptyException, PositionException{
        E dato = null;
        if(isEmpty()){
            throw new EmptyException("pila vacia");
        } else {
            return this.delete(0);
        }
    }

    public Integer getCima() {
        return cima;
    }
}
