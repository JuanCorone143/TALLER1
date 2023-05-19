
package controller.ed.pila;

import controller.ed.listaEnlazada.ListaEnlazada;
import controller.ed.listaEnlazada.exception.EmptyException;
import controller.ed.listaEnlazada.exception.PositionException;
import controller.ed.pila.exception.TopeException;

/**
 *
 * @author 
 */
public class Pila <E> extends ListaEnlazada<E>{
    private PilaI <E> pilai ;
    
    public Pila(Integer cima){
        pilai = new PilaI<>(cima);
    }
    
    public  void push(E obj) throws TopeException {
        pilai.push(obj);
    }
    
    public E pop()throws EmptyException,PositionException{
        return pilai.pop();
    }
    
    public Integer getCima(){
        return pilai.getCima();
    }
    public void print()throws EmptyException{
        pilai.imprimir();
    }
    
}
