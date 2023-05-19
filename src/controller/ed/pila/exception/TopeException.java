/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package controller.ed.pila.exception;

/**
 *
 * @author JUAN
 */
public class TopeException  extends Exception{

    /**
     * Creates a new instance of <code>NewException</code> without detail
     * message.
     */
    public TopeException() {
        super ("la pila esta llena");
    }

    /**
     * Constructs an instance of <code>NewException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TopeException(String msg) {
        super(msg);
    }
}
