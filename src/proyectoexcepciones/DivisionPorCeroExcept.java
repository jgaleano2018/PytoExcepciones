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
public class DivisionPorCeroExcept {
    
    public String Error;

    public String getError() {
        return Error;
    }

    public void setError(String Error) {
        this.Error = Error;
    }
    
    public DivisionPorCeroExcept(){
        
        this.Error = "División entre cero";
        setError(this.Error);
    }
    
    public static void DivisionPorCeroTrown() throws Exception {
        throw new Exception("División por cero");
    }
}
