/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.DAO;

import com.thoughtworks.xstream.io.StreamException;
import controller.ed.listaEnlazada.ListaEnlazada;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

/**
 *
 * @author JUAN
 */
public class AdaptadorDao <T> implements InterfazDao<T> {
    private Conexion conexion;
    private Class clazz;
    private String url;

    public AdaptadorDao(Class clazz) {
        this.conexion = new Conexion();
        this.clazz = clazz;
        this.url = Conexion.URL+clazz.getSimpleName().toLowerCase()+".json";
    }
    
    @Override
    public void guardar(T obj) throws IOException {
        T[] lista = (T[]) Array.newInstance(clazz, 1);
        try {
        T[] aux = listar();
        lista = (T[]) Array.newInstance(clazz, aux.length+1);
        for (int i = 0; i < aux.length; i++) {
            lista[i] = aux[i];
        }
        lista[aux.length] = obj;
        } catch (Exception e) {
            lista [0] = obj;
        }
        conexion.getXstream().alias(clazz.getSimpleName().toLowerCase(), clazz);
        conexion.getXstream().toXML(lista, new FileWriter(url));
    }

    @Override
    public void modificar(T obj, Integer pos) {
       try {
        T[] lista = listar();
        if (pos >= 0 && pos < lista.length) {
            lista[pos] = obj;
            conexion.getXstream().alias(clazz.getSimpleName().toLowerCase(), clazz);
            conexion.getXstream().toXML(lista, new FileWriter(url));
        } else {
            System.out.println("posicion invalida.");
        }
    } catch (Exception e) {
        System.out.println("fallo al modificar " + e.getMessage());
    }
    }

    @Override
    public T[] listar() throws StreamException {
        System.out.println(conexion.getXstream().fromXML(new File(url)));
        T[] result = (T[])conexion.getXstream().fromXML(url);
        return result;
    }

    @Override
    public T obtener(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
