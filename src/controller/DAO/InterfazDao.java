/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.DAO;

import com.thoughtworks.xstream.io.StreamException;
import java.io.IOException;

/**
 *
 * @author JUAN
 */
public interface InterfazDao <T>{
    /**
     * Metodo que permite guardar
     * @param obj Objeto del modelo
     */
    public void guardar(T obj) throws IOException;
    /**
     * Permite modificar los datos en un repositorio de datos
     * @param obj Objeto a modificar
     * @param pos posicion del arreglo
     */
    public void modificar(T obj, Integer pos);
    /**
     * Permite listar los elementos
     * @return un arreglo
     */
    public T[] listar()throws StreamException;
    /**
     * Permite obtener un elemento del arreglo
     * @param id Posicion
     * @return returna un dato
     */
    public T obtener(Integer id);
    
    
}
