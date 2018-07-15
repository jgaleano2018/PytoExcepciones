/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoexcepciones;

/**
 *
 * @author Jose Mauricio
 */
public class ClassAutocloseable /*extends AutoCloseable*/ {
    
    public void close() throws Exception {
        System.out.println("Closing");
    }
}
